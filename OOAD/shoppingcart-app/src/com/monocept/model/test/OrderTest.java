package com.monocept.model.test;

import java.util.List;

import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class OrderTest {
	public static void main(String[] args) {
		Product product = new Product(454, "Noodles", 50, 10);
		Product product1 = new Product(494, "pulses", 500, 5);
		LineItem lineItem = new LineItem(343, 50, product);
		LineItem lineItem2 = new LineItem(343, 50, product1);
		Order order = new Order(345, "12/04/2022");
		order.addItem(lineItem);
		order.addItem(lineItem2);
		PrintDetails.printOrders(order);

	}

	
}