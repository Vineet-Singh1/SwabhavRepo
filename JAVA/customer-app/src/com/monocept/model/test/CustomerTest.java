package com.monocept.model.test;

import com.monocept.model.Customer;

public class CustomerTest {

	public static void main(String[] args) {

		Customer c1 = new Customer("Rohan", "Hyderabad", 5000);
		Customer c2 = new Customer("Ramya", "Banglore", 2000);
		Customer c3 = new Customer("Rohan", "Mumbai", 1000);

		printDetails(c1);
		printDetails(c2);
		printDetails(c3);
	}

	private static void printDetails(Customer c) {
		System.out.println("id: " + c.getId() + " " + "name: " + c.getName() + " " + "City: " + c.getCity() + " "
				+ "orderamount: " + c.getOrderAmount());
	}

}
