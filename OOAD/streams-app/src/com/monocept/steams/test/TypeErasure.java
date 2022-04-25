package com.monocept.steams.test;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ravi");
		names.add("Monocept");
		
		
		List numbers = names;
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(names);
		System.out.println(numbers);

	}

}
