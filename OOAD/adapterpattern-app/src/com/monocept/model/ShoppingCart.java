package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items= new ArrayList<Item>();

	public void add(Item item) {
		items.add(item);
	}

	public void remove(Item item) {
		items.remove(item);
	}
	
	public double totalPrice() {
		double total =0;
		for(Item item: items) {
			total+= item.itemPrice();
		}
		return total;
	}
	public String getDetails() {
		String details ="";
		for(Item item: items) {
			details+=" name: "+item.itemName()+"  Price: "+item.itemPrice()+"\n";
			
		}
		details+=" Total Price: " +totalPrice();
		return details;
	}
}
