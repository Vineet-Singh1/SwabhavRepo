package com.monocept.model.test;

import com.monocept.model.BmiCalculater;
import com.monocept.model.GenderOption;
import com.monocept.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("shashank", 24, 5.5f, 60, GenderOption.Male);
		p1.workOut();
		printDetails(p1);
		p1.eat();
		printDetails(p1);
		BmiCalculater person = new BmiCalculater(p1);
		System.out.println(person.bodyCategory());
		System.out.println(person.getDetails());
		System.out.println(person.getBmiScore());

	}

	private static void printDetails(Person p) {
		System.out.println("name of the person: " + p.getName());
		System.out.println("age of the person is : " + p.getAge());
		System.out.println("height of the person is: " + p.getHeight());
		System.out.println("weight of the person is:" + p.getWeight());
		System.out.println("gender of the person is: " + p.getGender());
	}
}
