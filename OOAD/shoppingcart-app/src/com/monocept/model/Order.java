package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int id;
	private String date;
	private List<LineItem> items ;

	public Order(int id, String date) {
		this.id = id;
		this.date = date;
		items = new ArrayList<LineItem>();
	   
	}

	public void addItem(LineItem item) {
		items.add(item);
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public int getItemCount() {
		return items.size();
	}

	public double checkOutPrice() {
		double price = 0.0;
		for (LineItem list : getItems()) {
			price += list.calculateCost();
		}
		return price;
	}

}
