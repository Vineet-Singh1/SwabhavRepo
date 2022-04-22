package com.monocept.model;

import java.util.Scanner;

public class PlayGame {
	private int score;
	private int turn;
	private int die;
	private int turnScore, holdScore;

	public PlayGame() {
		score = 0;
		turn = 1;
		die = 0;
		holdScore = 0;
	}

	public void startGame() {
		while (true) {
			int temp = 0;
			boolean play = getChoice();

			if (play) {
				die = ((int) (Math.random() * 6) + 1);
				System.out.println("Die:" + die);
				turnScore += die;

				if (die == 1) {
					System.out.println("Turn Over.No score.");
					score -= (turnScore - 1);

					turnScore = 0;
					if (holdScore == 0)
						score = 0;
					break;
				}
				temp += die;

			}

			this.score += temp;
			if (this.score > 19)
				break;

		}

	}

	public void nextTurn() {
		while (this.score < 20) {
			System.out.println("TURN " + turn);
			turnScore = 0;
			startGame();
			printScores();
		}
		System.out.println("You finished in " + (turn - 1) + " turns");
		System.out.println("game over!");

	}

	public void printScores() {
		System.out.println("Turn Score: " + turnScore);
		System.out.println("Total Score:" + this.score);
		System.out.println("Total Turns:" + turn);
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		System.out.println();
		turn++;
	}

	public boolean getChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll or hold?(r/h)");
		char choice = sc.next().charAt(0);
		if (choice == 'r' || choice == 'R')
			return true;
		if (choice == 'h' || choice == 'H') {
			holdScore++;
			printScores();
			nextTurn();
			System.exit(0);
		}

		return false;

	}

}
