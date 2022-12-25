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
		return csvBeans;
		
	}
	
	
	private List<NamedColumnOutputBean> processWeightTypeLB(NamedColumnInputBean inputBean){
		
		BigDecimal price = new BigDecimal(inputBean.getPrice()); 
		BigDecimal weight = new BigDecimal(inputBean.getWeight());
		BigDecimal unitPrice = price.divide(weight);
		
		NamedColumnOutputBean primaryProduct = Transformers.convertMainProduct(inputBean);
		List<NamedColumnOutputBean> createSkus = Transformers.createSkus(inputBean);
		
		
		return null;
		
	}

}
