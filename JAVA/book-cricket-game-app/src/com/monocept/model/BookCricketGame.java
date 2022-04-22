package com.monocept.model;

import java.util.Scanner;

public class BookCricketGame {
	private int score;
	private int randomNumber;
	private int turns;
	private int lastPlayerScore;

	public BookCricketGame(int lastScore) {
		this.score = 0;
		this.turns = 0;
		lastPlayerScore = lastScore;
	}

	public void play() {
		while (true) {

			Scanner obj = new Scanner(System.in);
			System.out.println("To open the book press Y or any other key to stop press N:(Y/N)");
			char choice = obj.next().charAt(0);
			if (choice == 'N') {
				break;
			}
			System.out.println("Turn " + (turns + 1));
			randomNumber = (int) ((Math.random() * 300) + 1);
			System.out.println("random number: " + this.randomNumber);
			if (randomNumber % 7 == 0) {
				turns++;
				break;
			}
			this.score += randomNumber % 7;
			turns++;
			System.out.println("total score is: " + this.score);
			if (this.score > lastPlayerScore)
				break;
		}
	}

	public int getScore() {
		return this.score;
	}

	public String getWinner(BookCricketGame player) {
		if (this.getScore() > player.getScore())
			return "Player 1 Winner";
		if (this.getScore() < player.getScore())
			return "Player 2 Winner";
		if (this.getScore() == player.getScore()) {
			if (this.turns > player.turns)
				return "Player 1 Winner";
			if (this.turns < player.turns)
				return "Player 2 Winner";
			if (this.turns == player.turns)
				return "Game Tie";
		}

		return null;
	}

}
