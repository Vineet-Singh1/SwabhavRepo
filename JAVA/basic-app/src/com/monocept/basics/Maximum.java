package com.monocept.basics;

public class Maximum {

	public static void main(String[] numbers) {
		int max = Integer.parseInt(numbers[0]);

		for (int i = 1; i < numbers.length; i++) {
			if (max < Integer.parseInt(numbers[i]))
				max = Integer.parseInt(numbers[i]);
		}
		System.out.println("Maximum Number is:" + max);

	}
}
