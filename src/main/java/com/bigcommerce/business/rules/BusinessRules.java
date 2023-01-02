package com.bigcommerce.business.rules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.bigcommerce.beans.CsvBean;
import com.bigcommerce.beans.NamedColumnInputBean;
import com.bigcommerce.beans.NamedColumnOutputBean;
import com.bigcommerce.constants.OptionsConstants;
import com.bigcommerce.transformers.Transformers;

public class BusinessRules {
	
	public List<CsvBean> processInput(List<CsvBean> csvBeans){
		List<CsvBean> outputCsvBeans = new ArrayList<>();
		for(CsvBean csvBean: csvBeans) {
			NamedColumnInputBean inputBean = (NamedColumnInputBean)csvBean;
			if(inputBean.getWeightType().equalsIgnoreCase(OptionsConstants.WEIGHT_TYPE_LB)) {
				outputCsvBeans.addAll(process(inputBean));
			}
			
		}		
		return outputCsvBeans;
		
	}
	
	
	private List<NamedColumnOutputBean> process(NamedColumnInputBean inputBean){
		List<NamedColumnOutputBean> productListWithRulesSkus = new ArrayList<>();
		
		BigDecimal price = new BigDecimal(inputBean.getPrice()); 
		BigDecimal weight = new BigDecimal(inputBean.getWeight());
		BigDecimal unitPrice = price.divide(weight, 2, BigDecimal.ROUND_HALF_UP);
		
		
		NamedColumnOutputBean primaryProduct = Transformers.convertMainProduct(inputBean);
		productListWithRulesSkus.add(primaryProduct);
		List<NamedColumnOutputBean> createSkus = Transformers.createSkus(inputBean.getProductId(), inputBean.getRange(), inputBean.getWeightType());
		productListWithRulesSkus.addAll(createSkus);
		List<NamedColumnOutputBean> createRules = Transformers.createRules(inputBean.getProductId(), inputBean.getRange(), unitPrice, inputBean.getWeightType());
		productListWithRulesSkus.addAll(createRules);
		
		return productListWithRulesSkus;
		
	}
	
//	public static void main(String[] args) {
//		BigDecimal price = new BigDecimal("13.22222"); 
//		BigDecimal weight = new BigDecimal("22");
//		
//		BigDecimal unitPrice = price.divide(weight,2, BigDecimal.ROUND_HALF_UP);
//		System.out.println("The unit price is "+ unitPrice);
//		
//		BigDecimal priceBasedOnWeight  = unitPrice.multiply(new BigDecimal("3"));
//		System.out.println("The price based on weight without modification is "+ priceBasedOnWeight);
//		
//		
//	}


}
