package com.monocept.model;

public class Car extends Vehicle {

	public Car(String description) {
		super(description);

	}

	@Override
	public void move() {

		System.out.println(description + " Car is Moving");

	}

}
