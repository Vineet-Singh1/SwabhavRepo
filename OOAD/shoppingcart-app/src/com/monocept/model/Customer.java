package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void addOrder(Order order) {
		orders.add(order);
		
	}

	public List<Order> getOrder() {
		return orders;
	}

	public int getOrderCount() {
		return orders.size();
	}

}
