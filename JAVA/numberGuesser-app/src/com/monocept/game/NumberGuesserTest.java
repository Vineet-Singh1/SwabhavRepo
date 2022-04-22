package com.monocept.game;

import java.util.Scanner;

public class NumberGuesserTest {
	private static void numberGuesser() {
		Scanner obj = new Scanner(System.in);
		int userNumber, count = 0;
		int randomNumber = (int) (Math.random() * 100);
		char choice = '0';
		System.out.println("Enter a number 1-100 ");

		do {
			userNumber = obj.nextInt();
			if (userNumber == -1)
				break;
			if (randomNumber == userNumber) {
				System.out.println("Hurray!You got the number");
				count++;
				break;
			} else if (userNumber < randomNumber) {
				System.out.println("sorry too low,enter another number:(or for quit enter -1)");
				count++;
			} else {
				System.out.println("Sorry too high,Enter another number:(or for quit enter -1)");
				count++;
			}
		} while (userNumber >= 0);
		if (userNumber == -1) {
			System.out.println("You Quit the Game");
		} else
			System.out.println("Number of tries you made:" + count);

		System.out.println("want to play again:Y/N:");
		choice = obj.next().charAt(0);
		if (choice == 'Y')
			numberGuesser();
		obj.close();
	}

	public static void main(String[] args) {
		numberGuesser();
		System.out.println("Game Ended");
	}
}
