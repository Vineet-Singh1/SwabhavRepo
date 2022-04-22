package com.monocept.model;

abstract class Bike {

	public Bike() {
		System.out.println("Bike is created");
	}
    public void changeGear() {
    	System.out.println("Gear Changed");
    }
	abstract void run();
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely.");
	}
}