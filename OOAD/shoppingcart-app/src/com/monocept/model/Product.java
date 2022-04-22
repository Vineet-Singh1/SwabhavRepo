package com.monocept.model;

public class Product {
	private int id;
	private String name;
	private double price;
	private double discount;
	public static final double PERCENT = 0.01;

	public Product(int id, String name, double price, float discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount * price * PERCENT;
	}

	public double calculatePriceAfterDiscount() {
		return this.price - (price * discount * PERCENT);
	}

}
