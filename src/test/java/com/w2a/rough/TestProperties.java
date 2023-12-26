package com.w2a.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// reading properties files
		
		System.out.println(System.getProperty("user.dir"));
		//loading the config  file 
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		//calling config property file
		System.out.println(config.getProperty("browser"));
		
		//loading and calling OR property file
		Properties OR = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		
		System.out.println(OR.getProperty("bmlBtn_CSS"));
		
		

	}

}
