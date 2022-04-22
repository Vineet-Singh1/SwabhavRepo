package com.monocept.model.test;

import com.monocept.model.*;

public class CheckEvenOddTest {
	public static void main(String[] args) {
		CheckEvenOdd obj = new CheckEvenOdd();
		obj.printNumbers();
		System.out.println("Even numbers are: ");
		obj.printDetails(obj.getEvenNumbers());
		System.out.println("Odd numbers are:");
		obj.printDetails(obj.getOddNumbers());
	}

}
