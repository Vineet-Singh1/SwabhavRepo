package com.monocept.model2;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat eats meat");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Meow");
		
	}

	
}
