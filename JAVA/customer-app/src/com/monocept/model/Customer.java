package com.monocept.model;

public class Customer {

	private String name;
	private String city;
	private double orderAmount;
	private String id;
	private static int idGenerator;

	static {
		idGenerator = 1001;
	}

	public Customer(String name, String city, double orderAmount) {
		this.name = name;
		this.city = city;
		this.orderAmount = orderAmount;
		this.id = "c" + idGenerator++;
		
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	public double getOrderAmount() {
		return this.orderAmount;
	}

	public String getId() {
		return id;
	}
}
