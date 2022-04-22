package com.monocept.basics;

public class Average {

	public static void main(String[] numbers) {

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + Integer.parseInt(numbers[i]);
		}
		float avg = (float) (sum / 10.0);
		System.out.println("Average of Numbers are:" + avg);
	}

}
