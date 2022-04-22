package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.LineItem;
import com.monocept.model.Product;

class LineItemsJUnitTest {

	@Test
	void checkLineItemId() {
		Product product = new Product(56,"maggie",12,50);
		LineItem generator = new LineItem(113,10,product);
		int expectedItemId = 113;
		int itemId= generator.getId();
		assertTrue(itemId==expectedItemId);
	}
  @Test
  void checkLineItemName() {
	  Product product = new Product(56,"maggie",12,50);
		LineItem generator = new LineItem(113,10,product);
		int expectedQuantity= 10;
		int itemQuantity = generator.getQuantity();
		assertTrue(itemQuantity==expectedQuantity);
  }
}
