package com.monocept.model;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(18);
		list.add(45);
		list.add(12);
		list.display();
		list.remove(1);

		for (Integer item : list) {
			System.out.println(item);
		}
	}
}
