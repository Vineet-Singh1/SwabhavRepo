package com.monocept.model6;

public class AccountTest {

	public static void main(String[] args) {
		Person person1 = new Person(1000,3);
		Person person2 = new Person(2000);
		System.out.println("Interest for person 1 is: "+person1.getInterest());
		System.out.println("Interest for person 2 is: "+person2.getInterest());
	}
}
