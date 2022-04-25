package com.monocept.steams.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest_UpperBound {

	public static void main(String[] args) {
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(10);
		nos.add(20);
		nos.add(30);
		printDetails(nos);

		List<Double> doubleNos = new ArrayList<Double>();
		doubleNos.add(10.9);
		doubleNos.add(30.9);
		doubleNos.add(40.8);
		printDetails(doubleNos);

		List<Number> nosList = new ArrayList<Number>();
		addNumbersToList(nosList, 10);
		addNumbersToList(nosList, 10.55);

		List<Object> objectList = new ArrayList<Object>();
		addNumbersToList(objectList, 10.55);
		addNumbersToList(objectList, 10.55);
		System.out.println("super type " + objectList);

	}

	public static void addNumbersToList(List<? super Number> values, Number no) {
		values.add(no);
		System.out.println(values.get(0));
	}

	public static void printDetails(List<? extends Number> items) {
		items.forEach(System.out::println);
		System.out.println(items.get(0));
	}
}
