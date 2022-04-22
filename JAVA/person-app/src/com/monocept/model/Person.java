package com.monocept.model;

public class Person {
	private String name;
	private int age;
	private float height;
	private float weight;
	private GenderOption gender;
	final static float PERCENT = 1 / 100.0f;

	public Person(String name, int age, float height, float weight, GenderOption gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;

	}

	public Person(String name, int age) {
		this(name, age, 6.0f, 60, GenderOption.Male);
	}

	public void eat() {
		this.weight += this.weight * 10 * PERCENT;
	}

	public void workOut() {
		this.height += this.height * 2 * PERCENT;
		this.weight -= this.weight * 5 * PERCENT;

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public float getHeight() {
		return this.height;
	}

	public float getWeight() {
		return this.weight;
	}

	public GenderOption getGender() {
		return this.gender;
	}

}
