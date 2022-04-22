package com.monocept.model;

import java.lang.reflect.Method;

public class Reflector {
	public static void findAllMethodsNeedToRecfactor(Class classname) {
		Method[] methods = classname.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.println("Method: " + method.getName());
			}
		}
	}
}
