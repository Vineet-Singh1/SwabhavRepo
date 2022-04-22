package com.monocept.model;

public class Truck extends Vehicle {

	public Truck(String description) {
		super(description);

	}

	@Override
	public void move() {
		System.out.println(description+ " Truck is moving");

	}

}
