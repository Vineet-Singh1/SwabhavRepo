package com.monocept.model.test;

import com.monocept.model.*;

public class ManBoyTest {

	private static void atTheMovieHall(IEmotionable obj) {
		System.out.println("At the Movies: ");
		obj.cry();
		obj.laugh();
	}

	private static void atThePartyHall(IMannerable obj) {
		System.out.println("At the party: ");
		obj.wish();
		obj.depart();
	}

	public static void main(String[] args) {
		Man x = new Man();
		Boy y = new Boy();

		//atTheMovieHall(x);
		atThePartyHall(x);
		atTheMovieHall(y);
		atThePartyHall(y);

	}

}
