package com.monocept.factory.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.monocept.product.factory.IAuto;
import com.monocept.product.factory.IAutoFactory;

public class Test3 {

	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		IAutoFactory factory;
		factory = loadInstanceFromPropFile();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();

	}

	private static IAutoFactory loadInstanceFromPropFile()
			throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {

		FileReader reader = new FileReader("config.properties");
		Properties p = new Properties();
		p.load(reader);
		String path = p.getProperty("name");
		return (IAutoFactory) Class.forName(path).getMethod("getInstance", null).invoke(null, null);

	}

}
