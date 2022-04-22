package com.monocept.model.test;

import java.util.HashSet;

import com.monocept.model.LineItems;

public class LineItemsTest1 {

	public static void main(String[] args) {
		HashSet<LineItems> set = new HashSet<>();

		set.add(new LineItems(1, "Maggie", 5, 75));
		set.add(new LineItems(2, "Marie", 2, 20));
		set.add(new LineItems(1, "Maggie", 3, 75));

		for (LineItems item : set) {
			System.out.println(item.toString());
		}
	}

}
