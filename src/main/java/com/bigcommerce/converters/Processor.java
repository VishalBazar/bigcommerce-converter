package com.bigcommerce.converters;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.bigcommerce.beans.BeanConfigs;
import com.bigcommerce.beans.CsvBean;
import com.bigcommerce.beans.NamedColumnInputBean;
import com.bigcommerce.helpers.Helpers;

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

	}

}
