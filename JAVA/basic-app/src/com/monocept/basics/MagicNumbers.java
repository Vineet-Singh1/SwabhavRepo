package com.monocept.basics;

import java.util.Scanner;

public class MagicNumbers {

	public static void main(String[] args) {

		int userNumber;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		userNumber = obj.nextInt();

		int temp = userNumber;

		while (temp > 9) {
			int sum = 0;
			while (temp != 0) {
				int lastDigit = temp % 10;
				sum += lastDigit;
				temp = temp / 10;
			}
			temp = sum;
		}
		if (temp == 1)
			System.out.println("It is a magic Number");
		else
			System.out.println("It is not a magic Number");

	}
}
