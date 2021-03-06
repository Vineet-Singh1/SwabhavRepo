package com.monocept.model;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name) {
		this(id, name, 18);

	}

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		if (age >= 45)
			return age;
		return 18;
	}

	public Player whoIsElder(Player player) {
		/*
		 * if (this.age > player.age) return this; return player;
		 */
		return (this.age > player.age) ? this : player;
	}
}
