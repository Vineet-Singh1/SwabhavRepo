package com.monocept.model.test;

import com.monocept.model.*;

public class PolymorphismTest {

	public static void main(String[] args) {
		IMovable[] movable = { new Car("Ferari"), new Car("BMW"), new Truck("Tesla"), new Bike("Jawa") };
		startRace(movable);
	}

	private static void startRace(IMovable[] movables) {
		System.out.println("Starting the Race");
		for (IMovable m : movables) {
			m.move();
		}
	}
}
