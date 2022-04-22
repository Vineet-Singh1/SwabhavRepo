package com.monocept.model.test;

import com.monocept.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		Product product = new Product(123, "Toothpaste", 500, 20);
        PrintDetails.printProduct(product);
//		System.out.println("Product Id: " + product.getId());
//		System.out.println("Product Name: " + product.getName());
//		System.out.println("Product Price: " + product.getPrice());
//		System.out.println("Product Discount: " + product.getDiscount());
	}
}
