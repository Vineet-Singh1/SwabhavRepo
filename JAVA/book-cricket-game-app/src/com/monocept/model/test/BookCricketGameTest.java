package com.monocept.model.test;

import com.monocept.model.*;

public class BookCricketGameTest {

	public static void main(String[] args) {
		BookCricketGame player1;
		BookCricketGame player2;
		System.out.println("Player 1 turn: ");
		player1 = new BookCricketGame(100000000);
		player1.play();
		System.out
				.println("\n" + "\n" + "---------------------------------------------------------------------" + "\n");
		System.out.println("Player 2 turn: ");
		player2 = new BookCricketGame(player1.getScore());
		player2.play();
		System.out.println("Player 1 Score: " + player1.getScore() + "\n" + "Player 2 Score:" + player2.getScore());
		System.out.println(player1.getWinner(player2));

	}

}
