package com.bigcommerce.helpers;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.bigcommerce.constants.FileConstants;

public class Helpers {
	public static Path namedColumnCsvPath() throws URISyntaxException {
		URI uri = ClassLoader.getSystemResource(FileConstants.INPUT_CSV_FILE).toURI();
		return Paths.get(uri);
	}

}
