package com.monocept.model1;

public class OverloadingCalculationTest {

	public static void main(String[] args) {
		OverloadingCalculation obj = new OverloadingCalculation();
		obj.sum(93.454, 55.43);
		obj.sum(45.4f, 69.3f);
		obj.sum(435, 40);
	}
}
