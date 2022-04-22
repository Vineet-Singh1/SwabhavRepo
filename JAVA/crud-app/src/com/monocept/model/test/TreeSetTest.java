package com.monocept.model.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Sameer");
		treeSet.add("Rahul");
		treeSet.add("Sunil");
		treeSet.add("Vikrant");
		treeSet.add("Ankita");
		
		System.out.println(treeSet);
		
		treeSet.remove("Sunil");
		System.out.println("After removing a value: ");
		System.out.println(treeSet);
		
	}

}
