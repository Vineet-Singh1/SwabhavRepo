package com.monocept.model5;

public class Pig implements Animal {
	public void animalSound() {
		System.out.println("Pig Says Wee Wee");
	}

	@Override
	public void sleep() {
		System.out.println("Pig is sleeping : ZZzz");

	}
}
