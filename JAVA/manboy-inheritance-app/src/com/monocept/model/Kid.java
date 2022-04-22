package com.monocept.model;

public class Kid extends Man {

	static {
		System.out.println("You are in the Kid Static block");
	}

	@Override
	public void play() {
		System.out.println("Kid is Playing");
	}
}
