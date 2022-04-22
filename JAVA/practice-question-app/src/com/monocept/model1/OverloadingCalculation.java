package com.monocept.model1;

public class OverloadingCalculation {

	public void sum(int num1, int num2) {
		System.out.println("integer argument method invoked: " + (num1 + num2));
	}

	public void sum(float num1, float num2) {
		System.out.println("float argument method invoked: " + (num1 + num2));
	}

	public void sum(double num1, double num2) {
		System.out.println("double argument method invoked: " + (num1 + num2));
	}
}

