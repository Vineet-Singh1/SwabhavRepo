package com.monocept.model.test;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Product p1 = new Product(121, "noodles", 500, 5);
		Product p2 = new Product(132, "pulses", 1200, 10);

		LineItem li1 = new LineItem(201, 4, p1);
		LineItem li2 = new LineItem(202, 3, p2);

		Order o1 = new Order(324, "23/06/2021");
		 o1 = new Order(343, "25/07/2021");
		o1.addItem(li1);
		o1.addItem(li2);

		Customer cust1 = new Customer(132, "Rohan");
		cust1.addOrder(o1);
		PrintDetails.printCustomerDetails(cust1);

	}

}
