package com.monocept.model.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> linkSets = new LinkedHashSet<String>();

		linkSets.add("Student");
		linkSets.add("Professor");
		linkSets.add("Accountant");
		linkSets.add("Dean");

		System.out.println(linkSets);

		linkSets.remove("Accountant");
		System.out.println("After removing :");
		System.out.println(linkSets);
	}

}
