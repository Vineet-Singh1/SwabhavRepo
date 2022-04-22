package com.monocept.model;

public abstract class Vehicle implements IMovable {

	protected String description;

	public Vehicle(String desc) {
		this.description = desc;
		
	}

}
