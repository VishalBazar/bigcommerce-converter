package com.bigcommerce.helpers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.IOUtils;

import com.bigcommerce.constants.FileConstants;

public class Helpers {
	public static Path namedColumnCsvPath() throws URISyntaxException {
		URI uri = ClassLoader.getSystemResource(FileConstants.INPUT_CSV_FILE).toURI();
		return Paths.get(uri);
	}
	
	public static Path fileOutBeanPath() throws URISyntaxException {
        //URI uri = ClassLoader.getSystemResource(FileConstants.OUTPUT_CSV_FILE).toURI();
        
        Path path = Paths.get("/Users/wps/Desktop/Output.csv");
        
        		return path;
    }
	
	@SuppressWarnings("deprecation")
	public static String readFile(Path path) throws IOException {
        return IOUtils.toString(path.toUri());
    }

}
