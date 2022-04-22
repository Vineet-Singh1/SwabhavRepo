package com.monocept.model.test;

import java.util.*;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Dog");
		list.add("Horse");
		list.add("Cat");
		list.add("Camel");
		System.out.println(list);
		System.out.println("target element: " + list.get(3));
 
		ListIterator iterator = list.listIterator();
		list.set(1, "Giraffe");
       
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		
//		for (String name : list) {
//			System.out.println(name);
//		}
//		list.remove(3);
//		list.remove(1);
//		System.out.println("After removing elements from the list");
//		for (String name : list) {
//			System.out.println(name);
//		}
	}

}
