package com.monocept.model;

public class LineItems {
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;

	public LineItems(int id, String name, int qty, double utprice) {
		this.id = id;
		this.name = name;
		this.quantity = qty;
		this.unitPrice = utprice;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double calculateCost() {
		return quantity * unitPrice;
	}

	@Override
	public String toString() {
		return "Id: " + id + "  Item Name: " + name + "  Item quantity: " + quantity + "  Price " + unitPrice
				+ "  Total Cost: " + calculateCost();
	}

	@Override
	public boolean equals(Object ob) {
		LineItems obj = (LineItems) ob;
		if (this.id == obj.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hash = this.id;
		return hash;
	}
}
