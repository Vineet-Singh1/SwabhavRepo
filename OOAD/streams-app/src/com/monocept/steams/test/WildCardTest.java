package com.monocept.steams.test;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Hello", "World", "India");
		printDetails(names);

		List<Integer> nos = Arrays.asList(10, 20, 30, 40, 50);
		printDetails(nos);

	}

	public static void printDetails(List<?> items) {

		items.forEach(System.out::println);
	}
}
