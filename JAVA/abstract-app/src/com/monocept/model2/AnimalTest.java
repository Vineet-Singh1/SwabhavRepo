package com.monocept.model2;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat(), new Cow() };
		for (Animal animal : animals) {
			animal.eat();
			animal.makeSound();
		}
	}
}
