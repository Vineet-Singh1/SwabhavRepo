package com.monocept.model.test;

import java.util.List;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class PrintDetails {
	public static void printCustomerDetails(Customer cus) {
		System.out.println("Customer Details: ");
		System.out.println("Customer id: " + cus.getId());
		System.out.println("Customer name: " + cus.getName());
		List<Order> order = cus.getOrder();
		for (Order ord : order) {
			printOrders(ord);
		}
		System.out.println();
	}

	public static void printOrders(Order order) {
		System.out.println("Order Details: ");
		System.out.println("Order Id: " + order.getId());
		System.out.println("Order Date: " + order.getDate());
		System.out.println("Order Item count: " + order.getItemCount() + "\n");

		List<LineItem> li = order.getItems();
		for (LineItem item : li) {
			printLineItem(item);

		}
		System.out.println();
	}

	public static void printLineItem(LineItem li) {
		System.out.println("Line Items Details : ");
		System.out.println("Line Item id: " + li.getId());
		System.out.println("Line Item Quantity: " + li.getQuantity());
		System.out.println("Line Item Cost: " + li.calculateCost());
		System.out.println();
		PrintDetails.printProduct(li.getProduct());
		System.out.println();
	}

	public static void printProduct(Product product) {
		System.out.println("Product Details: ");
		System.out.println("Product id: " + product.getId());
		System.out.println("Product Name: " + product.getName());
		System.out.println("Product Price: " + product.getPrice());
		System.out.println("Product Discount: " + product.getDiscount());
		System.out.println("Product Price After discount: " + product.calculatePriceAfterDiscount());
		System.out.println();
	}

}
