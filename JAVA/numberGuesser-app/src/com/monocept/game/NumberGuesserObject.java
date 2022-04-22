package com.monocept.game;

import java.util.Scanner;

public class NumberGuesserObject {

	int randomNumber;
	int userNumber, counter;

	NumberGuesserObject() {
		randomNumber = (int) (Math.random() * 100);
		counter = 0;
	}

	public void check() {

		do {
			Scanner obj = new Scanner(System.in);
			userNumber = obj.nextInt();
			if (userNumber == -1) {
				System.out.println("You quit the Game");
				break;
			}
			if (userNumber == randomNumber) {
				System.out.println("Hurray,You got the number");
				System.out.println("No of tries you Made:" + counter);
				break;

			}
			if (userNumber < randomNumber) {
				System.out.println("Too Low,Enter another number:(or for quit press -1)");
				counter++;

			} else {
				System.out.println("Too High,Enter another number:(or for quit press -1)");
				counter++;

			}
		} while (userNumber >= 0);

	}
}
