package com.monocept.model.test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("Doctor");
		list.addFirst("Engineer");
		list.addLast("Accountant");
		list.addFirst("Manager");

		System.out.println(list);

		list.remove(2);
		System.out.println("After removing list");
		System.out.println(list);

	}

}
