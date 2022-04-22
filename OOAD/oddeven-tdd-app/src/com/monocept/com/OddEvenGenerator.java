package com.monocept.com;

public class OddEvenGenerator {
	public int[] getEvenNosTill(int limit) {

		if (limit < 0)
			throw new NegativeValuesNotAllowed("Negative values not allowed");
		int size = limit / 2;
		int[] evenNumbers = new int[size];
		for (int no = 2, index = 0; no <= limit; no += 2, index++) {
			evenNumbers[index] = no;
		}
		return evenNumbers;
	}

	public int[] getOddNoTill(int limit) {
		if (limit < 0)
			throw new NegativeValuesNotAllowed("Negative values not allowed");
		int size = (limit+1) / 2;
		int[] oddNumbers = new int[size];
		for (int no = 1, index = 0; no <= limit; no += 2, index++) {
			oddNumbers[index] = no;

		}
		return oddNumbers;
	}
}
