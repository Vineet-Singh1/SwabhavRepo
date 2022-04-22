package com.monocept.model.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
		map.put(45,"Anurag");
		map.put(56,"Vishal");
		map.put(78,"Priyanka");
		map.put(94,"Rohit");
		
		System.out.println(map);
		map.remove(78);
		System.out.println("After removing : "+map);
		
	}

}
