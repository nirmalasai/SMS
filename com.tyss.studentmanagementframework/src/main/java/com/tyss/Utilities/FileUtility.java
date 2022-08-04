package com.tyss.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getPropertyKeyValue(String key) throws IOException 
	{
		FileInputStream fileInputStream=new FileInputStream(IConstants.filePath);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String value = properties.getProperty(key);
		return value;
		
	}

	
	

}
