package com.monocept.model.test;

import com.monocept.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player sachin = new Player(12, "Sachin", 48);
		Player virat = new Player(2, "virat", 50);
		virat.getName();

		Player elder = virat.whoIsElder(sachin);
		printDetails(elder);

	}

	public static void printDetails(Player player) {
		System.out.println("player id=" + player.getId());
		System.out.println("player name=" + player.getName());
		System.out.println("player age=" + player.getAge());
	}

}
