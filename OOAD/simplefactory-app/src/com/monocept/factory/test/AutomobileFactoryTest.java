package com.monocept.factory.test;

import com.monocept.factory.AutoType;
import com.monocept.factory.AutomobileFactory;
import com.monocept.factory.IAutoMobile;

public class AutomobileFactoryTest {

	public static void main(String[] args) {

		AutomobileFactory factory = AutomobileFactory.getInstance();
		IAutoMobile product = factory.make(AutoType.BMW);

		product.start();
		product.stop();
		System.out.println(factory.hashCode());
		System.out.println("Product: " + product.getClass().getSimpleName());
		System.out.println("\n");
        
	    AutomobileFactory factory2 = AutomobileFactory.getInstance();
		product = factory2.make(AutoType.AUDI);
		product.start();
		product.stop();
		System.out.println(factory2.hashCode());
		System.out.println("Product: " + product.getClass().getSimpleName());
        
	}

}
