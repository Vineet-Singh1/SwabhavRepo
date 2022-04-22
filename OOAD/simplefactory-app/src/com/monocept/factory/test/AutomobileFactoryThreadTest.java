package com.monocept.factory.test;

import com.monocept.factory.AutoType;
import com.monocept.factory.AutomobileFactory;
import com.monocept.factory.IAutoMobile;

public class AutomobileFactoryThreadTest {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			AutomobileFactory factory1 = AutomobileFactory.getInstance();
			IAutoMobile product1 = factory1.make(AutoType.AUDI);
			product1.start();
			product1.stop();
			System.out.println(factory1.hashCode());
		});
		Thread t2 = new Thread(() -> {
			AutomobileFactory factory2 = AutomobileFactory.getInstance();
			IAutoMobile product2 = factory2.make(AutoType.BMW);
			product2.start();
			product2.stop();
			System.out.println(factory2.hashCode());
		});
		t1.start();
		t2.start();

	}
}
