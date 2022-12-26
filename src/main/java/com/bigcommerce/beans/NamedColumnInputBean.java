package com.bigcommerce.beans;

import com.opencsv.bean.CsvBindByName;

public class NamedColumnInputBean extends CsvBean {

	@CsvBindByName(column = "Item Type")
	private String itemType;

	@CsvBindByName(column = "Product ID")
	private String productId;

	@CsvBindByName(column = "Product Name")
	private String productName;

	@CsvBindByName(column = "Product Type")
	private String productType;

	@CsvBindByName(column = "Product Code/SKU")
	private String productCodeSKU;

	@CsvBindByName(column = "Bin Picking Number")
	private String binPickingNumber;

	@CsvBindByName(column = "Brand Name")
	private String brandName;

	@CsvBindByName(column = "Option Set")
	private String optionSet;

	@CsvBindByName(column = "Option Set Align")
	private String optionSetAlign;

	@CsvBindByName(column = "Product Description")
	private String productDescription;

	@CsvBindByName(column = "Price")
	private String price;

	@CsvBindByName(column = "Cost Price")
	private String costPrice;

	@CsvBindByName(column = "Retail Price")
	private String retailPrice;

	@CsvBindByName(column = "Sale Price")
	private String salePrice;

	@CsvBindByName(column = "Fixed Shipping Cost")
	private String fixedShippingCost;

	@CsvBindByName(column = "Free Shipping")
	private String freeShipping;

	@CsvBindByName(column = "Product Warranty")
	private String productWarranty;

	@CsvBindByName(column = "Product Weight")
	private String productWeight;

	@CsvBindByName(column = "Product Width")
	private String productWidth;

	@CsvBindByName(column = "Product Height")
	private String productHeight;

	@CsvBindByName(column = "Product Depth")
	private String productDepth;

	@CsvBindByName(column = "Allow Purchases?")
	private String allowPurchases;

	@CsvBindByName(column = "Product Visible?")
	private String productVisible;

	@CsvBindByName(column = "Product Availability")
	private String productAvailability;

	@CsvBindByName(column = "Track Inventory")
	private String trackInventory;

	@CsvBindByName(column = "Current Stock Level")
	private String currentStockLevel;

	@CsvBindByName(column = "Low Stock Level")
	private String lowStockLevel;

	@CsvBindByName(column = "Category")
	private String category;

	@CsvBindByName(column = "Product Image ID - 1")
	private String productImageId1;

	@CsvBindByName(column = "Product Image File - 1")
	private String productImageFile1;

	@CsvBindByName(column = "Product Image Description - 1")
	private String productImageDescription1;

	@CsvBindByName(column = "Product Image Is Thumbnail - 1")
	private String productImageIsThumbnail1;

	@CsvBindByName(column = "Product Image Sort - 1")
	private String productImageSort1;

	@CsvBindByName(column = "Search Keywords")
	private String searchKeywords;

	@CsvBindByName(column = "Page Title")
	private String pageTitle;

	@CsvBindByName(column = "Meta Keywords")
	private String metaKeywords;

	@CsvBindByName(column = "Meta Description")
	private String metaDescription;

	@CsvBindByName(column = "Product Condition")
	private String productCondition;

	@CsvBindByName(column = "Show Product Condition?")
	private String showProductCondition;

	@CsvBindByName(column = "Sort Order")
	private String sortOrder;

	@CsvBindByName(column = "Product Tax Class")
	private String productTaxClass;

	@CsvBindByName(column = "Product UPC/EAN")
	private String productUpcEan;

	@CsvBindByName(column = "Stop Processing Rules")
	private String stopProcessingRules;

	@CsvBindByName(column = "Product URL")
	private String productUrl;

	@CsvBindByName(column = "Redirect Old URL?")
	private String redirectOldUrl;

	@CsvBindByName(column = "GPS Global Trade Item Number")
	private String gpsGlobalTradeItemNumber;

	@CsvBindByName(column = "GPS Manufacturer Part Number")
	private String gpsManufacturerPartNumber;

	@CsvBindByName(column = "GPS Gender")
	private String gpsGender;

	@CsvBindByName(column = "GPS Age Group")
	private String gpsAgeGroup;
	
	@CsvBindByName(column = "GPS Color")
	private String gpsColor;

	@CsvBindByName(column = "GPS Size")
	private String gpsSize;

	@CsvBindByName(column = "GPS Material")
	private String gpsMaterial;

	@CsvBindByName(column = "GPS Pattern")
	private String gpsPattern;

	@CsvBindByName(column = "GPS Item Group ID")
	private String gpsItemGroupId;

	@CsvBindByName(column = "GPS Category")
	private String gpsCategory;

	@CsvBindByName(column = "GPS Enabled")
	private String gpsEnabled;

	@CsvBindByName(column = "Tax Provider Tax Code")
	private String taxProviderTaxCode;

	@CsvBindByName(column = "Product Custom Fields")
	private String productCustomFields;
	
	@CsvBindByName(column = "Weight Type")
	private String weightType;
	
	@CsvBindByName(column = "Weight")
	private String weight;
	
	@CsvBindByName(column = "Range")
	private String range;

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCodeSKU() {
		return productCodeSKU;
	}

	public void setProductCodeSKU(String productCodeSKU) {
		this.productCodeSKU = productCodeSKU;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getBinPickingNumber() {
		return binPickingNumber;
	}

	public void setBinPickingNumber(String binPickingNumber) {
		this.binPickingNumber = binPickingNumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getOptionSet() {
		return optionSet;
	}

	public void setOptionSet(String optionSet) {
		this.optionSet = optionSet;
	}

	public String getOptionSetAlign() {
		return optionSetAlign;
	}

	public void setOptionSetAlign(String optionSetAlign) {
		this.optionSetAlign = optionSetAlign;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getFixedShippingCost() {
		return fixedShippingCost;
	}

	public void setFixedShippingCost(String fixedShippingCost) {
		this.fixedShippingCost = fixedShippingCost;
	}

	public String getFreeShipping() {
		return freeShipping;
	}

	public void setFreeShipping(String freeShipping) {
		this.freeShipping = freeShipping;
	}

	public String getProductWarranty() {
		return productWarranty;
	}

	public void setProductWarranty(String productWarranty) {
		this.productWarranty = productWarranty;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductWidth() {
		return productWidth;
	}

	public void setProductWidth(String productWidth) {
		this.productWidth = productWidth;
	}

	public String getProductHeight() {
		return productHeight;
	}

	public void setProductHeight(String productHeight) {
		this.productHeight = productHeight;
	}

	public String getProductDepth() {
		return productDepth;
	}

	public void setProductDepth(String productDepth) {
		this.productDepth = productDepth;
	}

	public String getAllowPurchases() {
		return allowPurchases;
	}

	public void setAllowPurchases(String allowPurchases) {
		this.allowPurchases = allowPurchases;
	}

	public String getProductVisible() {
		return productVisible;
	}

	public void setProductVisible(String productVisible) {
		this.productVisible = productVisible;
	}

	public String getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(String productAvailability) {
		this.productAvailability = productAvailability;
	}

	public String getTrackInventory() {
		return trackInventory;
	}

	public void setTrackInventory(String trackInventory) {
		this.trackInventory = trackInventory;
	}

	public String getCurrentStockLevel() {
		return currentStockLevel;
	}

	public void setCurrentStockLevel(String currentStockLevel) {
		this.currentStockLevel = currentStockLevel;
	}

	public String getLowStockLevel() {
		return lowStockLevel;
	}

	public void setLowStockLevel(String lowStockLevel) {
		this.lowStockLevel = lowStockLevel;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductImageId1() {
		return productImageId1;
	}

	public void setProductImageId1(String productImageId1) {
		this.productImageId1 = productImageId1;
	}

	public String getProductImageFile1() {
		return productImageFile1;
	}

	public void setProductImageFile1(String productImageFile1) {
		this.productImageFile1 = productImageFile1;
	}

	public String getProductImageDescription1() {
		return productImageDescription1;
	}

	public void setProductImageDescription1(String productImageDescription1) {
		this.productImageDescription1 = productImageDescription1;
	}

	public String getProductImageIsThumbnail1() {
		return productImageIsThumbnail1;
	}

	public void setProductImageIsThumbnail1(String productImageIsThumbnail1) {
		this.productImageIsThumbnail1 = productImageIsThumbnail1;
	}

	public String getProductImageSort1() {
		return productImageSort1;
	}

	public void setProductImageSort1(String productImageSort1) {
		this.productImageSort1 = productImageSort1;
	}

	public String getSearchKeywords() {
		return searchKeywords;
	}

	public void setSearchKeywords(String searchKeywords) {
		this.searchKeywords = searchKeywords;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getShowProductCondition() {
		return showProductCondition;
	}

	public void setShowProductCondition(String showProductCondition) {
		this.showProductCondition = showProductCondition;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getProductTaxClass() {
		return productTaxClass;
	}

	public void setProductTaxClass(String productTaxClass) {
		this.productTaxClass = productTaxClass;
	}

	public String getProductUpcEan() {
		return productUpcEan;
	}

	public void setProductUpcEan(String productUpcEan) {
		this.productUpcEan = productUpcEan;
	}

	public String getStopProcessingRules() {
		return stopProcessingRules;
	}

	public void setStopProcessingRules(String stopProcessingRules) {
		this.stopProcessingRules = stopProcessingRules;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getRedirectOldUrl() {
		return redirectOldUrl;
	}

	public void setRedirectOldUrl(String redirectOldUrl) {
		this.redirectOldUrl = redirectOldUrl;
	}

	public String getGpsGlobalTradeItemNumber() {
		return gpsGlobalTradeItemNumber;
	}

	public void setGpsGlobalTradeItemNumber(String gpsGlobalTradeItemNumber) {
		this.gpsGlobalTradeItemNumber = gpsGlobalTradeItemNumber;
	}

	public String getGpsManufacturerPartNumber() {
		return gpsManufacturerPartNumber;
	}

	public void setGpsManufacturerPartNumber(String gpsManufacturerPartNumber) {
		this.gpsManufacturerPartNumber = gpsManufacturerPartNumber;
	}

	public String getGpsGender() {
		return gpsGender;
	}

	public void setGpsGender(String gpsGender) {
		this.gpsGender = gpsGender;
	}

	public String getGpsAgeGroup() {
		return gpsAgeGroup;
	}

	public void setGpsAgeGroup(String gpsAgeGroup) {
		this.gpsAgeGroup = gpsAgeGroup;
	}

	public String getGpsSize() {
		return gpsSize;
	}

	public void setGpsSize(String gpsSize) {
		this.gpsSize = gpsSize;
	}

	public String getGpsMaterial() {
		return gpsMaterial;
	}

	public void setGpsMaterial(String gpsMaterial) {
		this.gpsMaterial = gpsMaterial;
	}

	public String getGpsPattern() {
		return gpsPattern;
	}

	public void setGpsPattern(String gpsPattern) {
		this.gpsPattern = gpsPattern;
	}

	public String getGpsItemGroupId() {
		return gpsItemGroupId;
	}

	public void setGpsItemGroupId(String gpsItemGroupId) {
		this.gpsItemGroupId = gpsItemGroupId;
	}

	public String getGpsCategory() {
		return gpsCategory;
	}

	public void setGpsCategory(String gpsCategory) {
		this.gpsCategory = gpsCategory;
	}

	public String getGpsEnabled() {
		return gpsEnabled;
	}

	public void setGpsEnabled(String gpsEnabled) {
		this.gpsEnabled = gpsEnabled;
	}

	public String getTaxProviderTaxCode() {
		return taxProviderTaxCode;
	}

	public void setTaxProviderTaxCode(String taxProviderTaxCode) {
		this.taxProviderTaxCode = taxProviderTaxCode;
	}

	public String getProductCustomFields() {
		return productCustomFields;
	}

	public void setProductCustomFields(String productCustomFields) {
		this.productCustomFields = productCustomFields;
	}

	public String getWeightType() {
		return weightType;
	}

	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getGpsColor() {
		return gpsColor;
	}

	public void setGpsColor(String gpsColor) {
		this.gpsColor = gpsColor;
	}
	
	

}
