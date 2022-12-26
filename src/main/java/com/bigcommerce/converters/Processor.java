package com.bigcommerce.converters;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.bigcommerce.beans.BeanConfigs;
import com.bigcommerce.beans.CsvBean;
import com.bigcommerce.beans.NamedColumnInputBean;
import com.bigcommerce.helpers.Helpers;
import com.bigcommerce.business.rules.*;

public class Processor {

	public static List<CsvBean> namedSyncColumnBeanExample() throws Exception {
		Path path = Helpers.namedColumnCsvPath();
		List<CsvBean> csvBeanList = new ArrayList<>();
		csvBeanList = BeanConfigs.beanBuilderExample(path, NamedColumnInputBean.class);

		return csvBeanList;
	}

	public static void main(String[] args) throws Exception {
		List<CsvBean> csvBeans = namedSyncColumnBeanExample();
		System.out.println(csvBeans.size());
		BusinessRules businessRules = new BusinessRules();
		List<CsvBean> outputCsvBean = businessRules.processInput(csvBeans);
		writeSyncCsvFromBean(outputCsvBean);
		
		System.out.println("The process is complete");

	}
	
	public static void writeSyncCsvFromBean(List<CsvBean> csvBeans) throws Exception {
        Path path = Helpers.fileOutBeanPath();
        BeanConfigs.writeCsvFromBean(path, csvBeans);
    }
	

}
