package com.monocept.model.test;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class CustomerTest {
	public static void main(String[] args) {
		Customer cus1 = new Customer(654, "Virat");
		Product product = new Product(454, "Noodles", 50, 10);
		Product product2 = new Product(345, "oats", 20, 20);
		LineItem lineItem = new LineItem(343, 50, product);
		LineItem lineItem2 = new LineItem(342, 60, product2);
		Order order = new Order(345, "12/04/2022");
		order.addItem(lineItem);
		order.addItem(lineItem2);
		cus1.addOrder(order);
		PrintDetails.printCustomerDetails(cus1);

	}
}
