package com.monocept.model.test;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(45);
		set.add(56);
		set.add(78);
		set.add(94);

		System.out.println(set);
		set.remove(45);
		System.out.println(set);
	}

}
