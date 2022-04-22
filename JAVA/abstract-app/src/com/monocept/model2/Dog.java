package com.monocept.model2;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats Biscuit");

	}

	@Override
	public void makeSound() {
		System.out.println("Woof Woof");

	}

}
