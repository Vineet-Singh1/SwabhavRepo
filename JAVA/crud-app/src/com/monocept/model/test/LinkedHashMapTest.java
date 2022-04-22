package com.monocept.model.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Dog", 5);
		map.put("Camel", 8);
		map.put("cat", 9);
		map.put("Cow", 3);

		System.out.println(map);
		map.remove("cat");
		System.out.println(map);

	}

}
