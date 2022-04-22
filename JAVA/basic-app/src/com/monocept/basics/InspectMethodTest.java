package com.monocept.basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class InspectMethodTest {

	private void inspect(Class className) {
		int count = 0;
		int noOfGetters = 0;
		int noOfSetters = 0;
		Method[] methodClass = className.getDeclaredMethods();
		for (Method method : methodClass) {
			System.out.println("name method in class " + className + " " + method);
			count++;
			String methodName = method.getName();
			if (methodName.startsWith("get")) {
				noOfGetters++;
			}
			if (methodName.startsWith("set")) {
				noOfSetters++;
			}
		}
		System.out.println("number of methods" + " " + className + " :" + count);
		count = 0;
		Constructor[] constructorClass = className.getConstructors();
		for (Constructor construct : constructorClass) {
			System.out.println("name of constructor in :" + className + " " + construct);
			count++;
		}
		System.out.println("number of constructor" + " " + className + " is " + count);
		System.out.println("number of getter in class:" + " " + className + " is: " + noOfGetters);
		System.out.println("number of setter in class:" + " " + className + " is: " + noOfSetters);
	}

	public static void main(String[] args) throws Exception {
		InspectMethodTest ob = new InspectMethodTest();
		ob.inspect(String.class);
		ob.inspect(Object.class);

	}
}
