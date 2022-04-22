package com.monocept.model;

public class Test {

	public static void main(String[] args) {
		CarService service = new OilChange(new TyreRotation(new CarInspection()));
		System.out.println("Total Cost is: " + service.getCost());

	}

}
