package com.monocept.model2;

public class Cow implements Animal{

	@Override
	public void eat() {
		System.out.println("Cow eats Grass");
	}

	@Override
	public void makeSound() {
		System.out.println("MOO");
		
	}

}
