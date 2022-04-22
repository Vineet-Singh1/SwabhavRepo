package com.monocept.basics;

public class WrapperTest {

	public static void main(String[] args) {
		int primitive = 20;
		Integer obj1 = Integer.valueOf(primitive); // Boxing
		Integer obj2 = primitive; // Autoboxing
		System.out.println(primitive + " " + obj1 + " " + obj2);

		Integer obj3 = new Integer(40);
		int x = obj3.intValue();

		int y = obj3; // unboxing
		System.out.println(obj3 + " " + x + " " + y);

	}

}
