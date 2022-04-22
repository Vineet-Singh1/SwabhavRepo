package com.monocept.basics;

public class Minimum {

	public static void main(String[] numbers) {
		int min = Integer.parseInt(numbers[0]);

		for (int i = 1; i < numbers.length; i++) {
			if (min > Integer.parseInt(numbers[i]))
				min = Integer.parseInt(numbers[i]);

		}
		System.out.println("Minimum Number is:" + min);

	}
}
