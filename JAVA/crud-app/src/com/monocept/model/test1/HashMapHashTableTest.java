package com.monocept.model.test1;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapHashTableTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put(null, null);
		map.put("key", null);
		map.put("Key2", null);
		System.out.println(map);
		
		Hashtable<String,String> hashtable = new Hashtable<String, String>();
		try {
		hashtable.put(null, null);
		System.out.println(hashtable);
		}catch(Exception e) {
			System.out.println("Hashtable does not allow a null key ");
		}
	}

}
