package com.monocept.basics;

public class Sum {

	public static void main(String[] numbers) {
		
		int s = 0;
		for (int i = 0; i < numbers.length; i++) {
			s = s + Integer.parseInt(numbers[i]);

		}
		System.out.println("Sum of array:" + s);
	}

}