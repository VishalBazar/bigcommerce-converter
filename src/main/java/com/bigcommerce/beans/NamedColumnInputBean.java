package com.bigcommerce.beans;

import com.opencsv.bean.CsvBindByName;

public class NamedColumnInputBean extends CsvBean {

	@CsvBindByName(column = "Item Typle")
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

}
