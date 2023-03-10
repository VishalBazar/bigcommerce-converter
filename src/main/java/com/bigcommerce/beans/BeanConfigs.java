package com.bigcommerce.beans;

import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import com.bigcommerce.helpers.Helpers;
import com.bigcommerce.pojos.CsvTransfer;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class BeanConfigs {

	public static List<CsvBean> beanBuilderExample(Path path, Class<? extends CsvBean> clazz) throws Exception {
		CsvTransfer csvTransfer = new CsvTransfer();
		try (Reader reader = Files.newBufferedReader(path)) {
			CsvToBean<CsvBean> cb = new CsvToBeanBuilder<CsvBean>(reader).withType(clazz).build();

			csvTransfer.setCsvList(cb.parse());
		}

		return csvTransfer.getCsvList();
	}
	
	public static void writeCsvFromBean(Path path, List<CsvBean> csvBeans) throws Exception {

        try (Writer writer = new FileWriter(path.toString())) {
            StatefulBeanToCsv<CsvBean> sbc = new StatefulBeanToCsvBuilder<CsvBean>(writer)
              //.withQuotechar('\'')
              .withSeparator(',')
              .build();

            sbc.write(csvBeans);
        }

    }

}
