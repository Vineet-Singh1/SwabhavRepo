package com.monocept.model;

public class Infant extends Man {
	static {
		System.out.println("You are in the Infant Static block");
	}

	@Override
	public void play() {
		System.out.println("Infant is Playing");
	}
}
