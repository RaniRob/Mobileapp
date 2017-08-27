package com.library;

import java.io.FileInputStream;
import java.util.Properties;

public class GenericLib {
	
	public static String configpath=BaseAutoamtion.SDirpath+"\\config.properties";
	
	public static String getproperties(String key){
		String svalue=null;
		try{
		FileInputStream file=new FileInputStream(configpath);
		Properties properties=new Properties();
		properties.load(file);
		svalue=properties.getProperty(key);
		}catch(Exception e){
			e.printStackTrace();
		}
		return svalue;
	}

}
