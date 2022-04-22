package com.monocept.model.test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(2, "Angad");
		treeMap.put(8, "vishal");
		treeMap.put(4, "Pranav");
		treeMap.put(5, "Rohit");

		System.out.println("Tree Set :" + treeMap);
		treeMap.remove(8);
		System.out.println("After Removing values :" + treeMap);

	}

}
