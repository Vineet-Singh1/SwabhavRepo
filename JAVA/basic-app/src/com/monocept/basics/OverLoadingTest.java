package com.monocept.basics;

public class OverLoadingTest {
	static void printInfo(String s) {
		System.out.println(s);
	}

	static void printInfo(int n) {
		System.out.println(n);

	}

	static void printInfo(Double n) {
		System.out.println(n);
		System.out.println("it's a double value");
	}

	static void printInfo(float n) {
		System.out.println(n);
		System.out.println("it's a float value");

	}

	static void printInfo(Boolean bool) {
		System.out.println(bool);
	}

	static void printInfo(char c) {
		System.out.println(c);
	}

	public static void main(String[] args) {

		OverLoadingTest.printInfo("hello");
		OverLoadingTest.printInfo(100);
		OverLoadingTest.printInfo(100.55);
		OverLoadingTest.printInfo(100.55f);
		OverLoadingTest.printInfo(1 == 0);
		OverLoadingTest.printInfo('#');

	}

}
