package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("resources//config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String address = prop.getProperty("address");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(address);
	}

}
