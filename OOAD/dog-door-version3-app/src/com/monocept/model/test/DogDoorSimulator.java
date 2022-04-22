package com.monocept.model.test;

import com.monocept.model.DogDoor;
import com.monocept.model.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println();
		remote.pressButton();
		System.out.println("\n Fido's gone outside ");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("...but Fido stuck outside ");
			System.out.println("\n Fido's start barking.....");
			System.out.println(".... so gina grabs the remote control.");
			remote.pressButton();
			System.out.println("\n fido's back inside");
		}
	}
}