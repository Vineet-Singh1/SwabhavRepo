package com.monocept.model.test;

import com.monocept.model.LineItem;
import com.monocept.model.Product;

public class LineItemTest {
	public static void main(String[] args) {

		Product product = new Product(454, "Noodles", 50, 10);
		LineItem lineItem = new LineItem(343, 50, product);
		PrintDetails.printLineItem(lineItem);

//		System.out.println("LineItem id: " + lineItem.getId());
//		System.out.println("LineItem Quantity: " + lineItem.getQuantity());
//		
//		System.out.println("LineItem Product details: ");
//		System.out.println("Product Id: " + product.getId());
//		System.out.println("Product Name: " + product.getName());
//		System.out.println("Product Price: " + product.getPrice());
//		System.out.println("Product Discount: " + product.getDiscount());

	}

}
