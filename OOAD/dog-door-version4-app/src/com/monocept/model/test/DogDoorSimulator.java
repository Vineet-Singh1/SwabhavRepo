package com.monocept.model.test;

import com.monocept.model.BarkRecognizer;
import com.monocept.model.DogDoor;
import com.monocept.model.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("Fido starts barking.");
		recognizer.recognize("Woof");

		System.out.println("\nFido has gone outside...");

		System.out.println("\nFido's all done...");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

			System.out.println("...but Fido stuck outside ");
			System.out.println("\n Fido's start barking.....");
			System.out.println(".... so gina grabs the remote control.");
			remote.pressButton();
			System.out.println("\n fido's back inside");
		}
		System.out.println("...but he's stuck outside!");

		System.out.println("Fido Starts barking...");
		recognizer.recognize("Woof");

		System.out.println("\nFido's back inside...");
	}
}
