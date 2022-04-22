package com.monocept.model.test;

import java.util.ArrayList;
import java.util.List;

import com.monocept.model.LineItems;

public class LineItemsTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new LineItems(101, "Cinthol", 2, 45));
		list.add(new LineItems(201, "Deo", 3, 110));

		 list.add("Monocept");
		for (Object obj : list) { 
			System.out.println(obj.toString());

	}
	}
}
