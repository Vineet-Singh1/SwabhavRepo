package com.monocept.steams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayStreamTest {

	public static void main(String[] args) {
//		caseStudy1();
//		caseStudy2();
		caseStudy4();
	}

	private static void caseStudy4() {
		Account[] accounts = { new Account(101, "Abhishek", 5000), new Account(102, "Vineet", 3000),
				new Account(103, "Rohan", 5000), new Account(104, "Shikhar", 15000) };

		Account acc = Arrays.stream(accounts).max(Comparator.comparing(Account::getBalance)).get();
		System.out.println(acc);

		Arrays.stream(accounts).filter(n -> n.getName().length() > 6).forEach(n -> {
			System.out.println(n.getName());
		});

		Double sum1 = Arrays.stream(accounts).mapToDouble(n1 -> n1.getBalance()).sum();
		System.out.println(sum1);

//		List<Account> accounts = new ArrayList<>();
//		accounts.add(new Account(101, "Abhishek", 5000));
//		accounts.add(new Account(102, "Vineet", 3000));
//		accounts.add(new Account(103, "Rohan", 10000));
//		accounts.add(new Account(104, "Shikhar", 15000));
//
//		Optional<Account> acc = accounts.stream()
//				.collect(Collectors.maxBy(Comparator.comparingDouble(Account::getBalance)));
//		System.out.println(acc.toString());
//
//		Arrays.stream(accounts).filter(n -> n.getName().length() > 6).forEach(n -> {
//			System.out.println(n.getName());
//		});
//
//		Double acc1 = accounts.stream().collect(Collectors.summingDouble(Account::getBalance));
//		System.out.println("Sum of the Balances of all account holder: " + acc1);

	}

	private static void caseStudy2() {
		String[] names = { "Vishak", "Mary", "Aditi" };
		Stream<String> sortedNamesStream = Arrays.stream(names).filter((name) -> {
			return name.toLowerCase().contains("a");
		}).sorted(ArrayStreamTest::sortTheNames).map(ArrayStreamTest::mapFirstFourLetters);
		sortedNamesStream.forEach(n -> System.out.println(n.toUpperCase()));
//		sortedNamesStream.forEach(n -> System.out.println(n.toUpperCase()));

	}

	private static String mapFirstFourLetters(String name) {
		String newName = "";
		for (int i = 0; i < 4; i++) {
			newName += name.charAt(i);
		}
		return newName;

	}

	private static int sortTheNames(String n1, String n2) {
		return n2.compareTo(n1);

	}

	private static void printDetails(String name) {
		System.out.println(name);
	}

	private static void foo(String name) {
		System.out.println(name);
	}

	private static void caseStudy1() {
		String[] names = { "Vishak", "Mary", "Aditi" };
		Arrays.stream(names).forEach(ArrayStreamTest::printDetails);

		Arrays.stream(names).forEach(ArrayStreamTest::foo);

		Arrays.stream(names).forEach(n -> System.out.println(n));

		Arrays.stream(names).forEach(System.out::println);
	}
}
