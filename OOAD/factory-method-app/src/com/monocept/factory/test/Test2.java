package com.monocept.factory.test;

import com.monocept.product.factory.BmwFactory;
import com.monocept.product.factory.IAuto;
import com.monocept.product.factory.IAutoFactory;

public class Test2 {
	public static void main(String[] args) {
		IAutoFactory factory;
		factory = BmwFactory.getInstance();
		
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}

}
