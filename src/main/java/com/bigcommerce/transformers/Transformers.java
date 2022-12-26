package com.bigcommerce.transformers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bigcommerce.beans.CsvBean;
import com.bigcommerce.beans.NamedColumnInputBean;
import com.bigcommerce.beans.NamedColumnOutputBean;

public class Transformers {
	
	public static NamedColumnOutputBean convertMainProduct(NamedColumnInputBean inputBean) {
		NamedColumnOutputBean outputBean = new NamedColumnOutputBean();
		
		outputBean.setItemType(inputBean.getItemType());
		outputBean.setProductId(inputBean.getProductId());
		outputBean.setProductName(inputBean.getProductName());
		outputBean.setProductType(inputBean.getProductType());
		outputBean.setProductCodeSKU(inputBean.getProductCodeSKU());
		
		outputBean.setBinPickingNumber(inputBean.getBinPickingNumber());
		outputBean.setBrandName(inputBean.getBrandName());
		outputBean.setOptionSet(inputBean.getOptionSet());
		outputBean.setOptionSetAlign(inputBean.getOptionSetAlign());
		outputBean.setProductDescription(inputBean.getProductDescription());
		
		outputBean.setPrice(inputBean.getPrice());
		outputBean.setCostPrice(inputBean.getCostPrice());
		outputBean.setRetailPrice(inputBean.getRetailPrice());
		outputBean.setSalePrice(inputBean.getSalePrice());
		
		outputBean.setFixedShippingCost(inputBean.getFixedShippingCost());
		outputBean.setFreeShipping(inputBean.getFreeShipping());
		outputBean.setProductWarranty(inputBean.getProductWarranty());
		outputBean.setProductWeight(inputBean.getProductWeight());
		outputBean.setProductWidth(inputBean.getProductWidth());
		outputBean.setProductHeight(inputBean.getProductHeight());
		outputBean.setProductDepth(inputBean.getProductDepth());
		
		outputBean.setAllowPurchases(inputBean.getAllowPurchases());
		outputBean.setProductVisible(inputBean.getProductVisible());
		outputBean.setProductAvailability(inputBean.getProductAvailability());
		outputBean.setTrackInventory(inputBean.getTrackInventory());
		outputBean.setCurrentStockLevel(inputBean.getCurrentStockLevel());
		outputBean.setLowStockLevel(inputBean.getLowStockLevel());
		
		outputBean.setCategory(inputBean.getCategory());
		outputBean.setProductImageId1(inputBean.getProductImageId1());
		outputBean.setProductImageFile1(inputBean.getProductImageFile1());
		outputBean.setProductImageDescription1(inputBean.getProductImageDescription1());
		outputBean.setProductImageIsThumbnail1(inputBean.getProductImageIsThumbnail1());
		outputBean.setProductImageSort1(inputBean.getProductImageSort1());
		
		outputBean.setSearchKeywords(inputBean.getSearchKeywords());
		outputBean.setPageTitle(inputBean.getPageTitle());
		outputBean.setMetaKeywords(inputBean.getMetaKeywords());
		outputBean.setMetaDescription(inputBean.getMetaDescription());
		
		outputBean.setProductCondition(outputBean.getProductCondition());
		outputBean.setSortOrder(inputBean.getSortOrder());
		outputBean.setProductTaxClass(inputBean.getProductTaxClass());
		
		outputBean.setProductUpcEan(inputBean.getProductUpcEan());
		outputBean.setStopProcessingRules(inputBean.getStopProcessingRules());
		outputBean.setProductUrl(inputBean.getProductUrl());
		outputBean.setRedirectOldUrl(inputBean.getRedirectOldUrl());
		
		outputBean.setGpsGlobalTradeItemNumber(inputBean.getGpsGlobalTradeItemNumber());
		outputBean.setGpsManufacturerPartNumber(inputBean.getGpsManufacturerPartNumber());
		outputBean.setGpsGender(inputBean.getGpsGender());
		outputBean.setGpsAgeGroup(inputBean.getGpsAgeGroup());
		outputBean.setGpsColor(inputBean.getGpsColor());
		outputBean.setGpsSize(inputBean.getGpsSize());
		outputBean.setGpsMaterial(inputBean.getGpsMaterial());
		outputBean.setGpsPattern(inputBean.getGpsPattern());
		outputBean.setGpsItemGroupId(inputBean.getGpsItemGroupId());
		outputBean.setGpsCategory(inputBean.getGpsCategory());
		
		outputBean.setTaxProviderTaxCode(inputBean.getTaxProviderTaxCode());
		outputBean.setProductCustomFields(inputBean.getProductCustomFields());	
		
		return outputBean;
		
	}

	public static List<NamedColumnOutputBean> createSkus(String productId, String range) {
		List<String> ranges = new ArrayList<>(Arrays.asList(range.split(",")));
		List<NamedColumnOutputBean> skus = new ArrayList<>();
		//create Skus
		for(String weight: ranges) {
			NamedColumnOutputBean sku = new NamedColumnOutputBean();
			sku.setItemType("SKU");
			sku.setProductName("[S]Weight lb="+weight+" LB");
			sku.setProductCodeSKU(productId+"-"+weight+"L");
			skus.add(sku);			
		}
		
		return skus;
	}
	
	public static List<NamedColumnOutputBean> createRules(String productId, String range, BigDecimal unitPrice){
		List<String> ranges = new ArrayList<>(Arrays.asList(range.split(",")));
		List<NamedColumnOutputBean> rules = new ArrayList<>();
		
		//create rules
		for(String weight: ranges) {
			NamedColumnOutputBean rule = new NamedColumnOutputBean();
			rule.setItemType("Rule");
			rule.setProductCodeSKU(productId+"-"+weight+"L");
			BigDecimal priceBasedOnWeight  = unitPrice.multiply(new BigDecimal(weight));
			rule.setPrice("[FIXED]"+convertTo99Cents(priceBasedOnWeight));
			rules.add(rule);			
		}
		
		return rules;
		
	}
	
	private static String convertTo99Cents(BigDecimal price) {
		return price.setScale(0, BigDecimal.ROUND_HALF_UP).subtract(new BigDecimal("0.01")).toString();

		
	}
	
//	public static void main(String[] args) {
//		BigDecimal price = new BigDecimal("12.61");
//		
//		//price.setScale(2, BigDecimal.ROUND_CEILING);
//		
//		
//		System.out.println(price.setScale(0, BigDecimal.ROUND_HALF_UP).subtract(new BigDecimal("0.01")));
//		
//		
//		
//	}

}
