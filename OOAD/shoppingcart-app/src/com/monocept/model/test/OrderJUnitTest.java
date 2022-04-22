package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Order;

class OrderJUnitTest {

	@Test
	void checkOrderId() {
		Order generator = new Order(44,"12/10/2010");
		int expectedId = 44;
		int id = generator.getId();
		assertTrue(id==expectedId);
	}
   @Test
   void checkOrderDate() {
	   Order generator = new Order(234,"12/03/2020");
	   String expectedDate = "12/03/2020";
	   String date = generator.getDate();
	   assertTrue(date.equals(expectedDate));
   }
}
