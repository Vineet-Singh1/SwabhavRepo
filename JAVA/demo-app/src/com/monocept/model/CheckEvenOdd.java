package com.monocept.model;

public class CheckEvenOdd {
	private int[] evenNumber;
	private int[] oddNumber;
	private int initial = 0;
	private int start = 0;

	private int number = 1;

	public CheckEvenOdd() {
		evenNumber = new int[50];
		oddNumber = new int[50];
	}

	public void printNumbers() {
		boolean check = true;

		if (number <= 100) {
			check = checkNumber(number);
			if (check) {
				evenNumber[initial] = number;
				initial++;
			} else {
				oddNumber[start] = number;
				start++;
			}
			number++;

			printNumbers();
		}
	}

	public int[] getEvenNumbers() {
		return evenNumber;
	}

	public int[] getOddNumbers() {
		return oddNumber;
	}

	public static boolean checkNumber(int number) {
		if (number % 2 == 0)
			return true;
		return false;
	}

	public void printDetails(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println(" ");

	}

}
