package com.bigcommerce.business.rules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.bigcommerce.beans.CsvBean;
import com.bigcommerce.beans.NamedColumnInputBean;
import com.bigcommerce.beans.NamedColumnOutputBean;
import com.bigcommerce.constants.ModifierConstants;
import com.bigcommerce.transformers.Transformers;

public class BusinessRules {
	
	public List<CsvBean> processInput(List<CsvBean> csvBeans){
		List<CsvBean> outputCsvBeans = new ArrayList<>();
		for(CsvBean csvBean: csvBeans) {
			NamedColumnInputBean inputBean = (NamedColumnInputBean)csvBean;
			if(inputBean.getWeightType().equalsIgnoreCase(ModifierConstants.WEIGHT_TYPE_LB)) {
				outputCsvBeans.addAll(processWeightTypeLB(inputBean));
			}
			
		}		
		return outputCsvBeans;
		
	}
	
	
	private List<NamedColumnOutputBean> processWeightTypeLB(NamedColumnInputBean inputBean){
		List<NamedColumnOutputBean> productListWithRulesSkus = new ArrayList<>();
		
		BigDecimal price = new BigDecimal(inputBean.getPrice()); 
		BigDecimal weight = new BigDecimal(inputBean.getWeight());
		BigDecimal unitPrice = price.divide(weight, 2, BigDecimal.ROUND_HALF_UP);
		
		
		NamedColumnOutputBean primaryProduct = Transformers.convertMainProduct(inputBean);
		productListWithRulesSkus.add(primaryProduct);
		List<NamedColumnOutputBean> createSkus = Transformers.createSkus(inputBean.getProductId(), inputBean.getRange());
		productListWithRulesSkus.addAll(createSkus);
		List<NamedColumnOutputBean> createRules = Transformers.createRules(inputBean.getProductId(), inputBean.getRange(), unitPrice);
		productListWithRulesSkus.addAll(createRules);
		
		return productListWithRulesSkus;
		
	}

}
