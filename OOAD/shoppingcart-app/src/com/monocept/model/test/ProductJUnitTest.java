package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Product;

class ProductJUnitTest {

	@Test
	void checkProductId() {
		Product generator = new Product(245, "watch", 400, 10);
		int expectedId = 245;
		int productId = generator.getId();
		assertTrue(expectedId == productId);

	}

	@Test
	void checkProductName() {
		Product generator = new Product(245, "Steel", 500, 20);
		String expectedName = "Steel";
		String productName = generator.getName();
		assertTrue(expectedName.equals(productName));
	}

	@Test
	void checkProductPrice() {
		Product generator = new Product(453, "Watch", 1000, 10);
		double expectedPrice = 1000;
		double productPrice = generator.getPrice();
		assertTrue(expectedPrice == productPrice);
	}

	@Test
	void checkDiscount() {
		Product generator = new Product(453, "Watch", 1000, 10);
		double expectedDiscount = 100;
		double productDiscount = generator.getDiscount();
		assertTrue(expectedDiscount == productDiscount);
	}
}
