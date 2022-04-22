package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Customer;

class CustomerJUnitTest {

	@Test
	void checkCustomerName() {
		Customer generator = new Customer(203, "Vikas");
		String expectedName ="Vikas";
		String name = generator.getName();
		assertTrue(name.equals(expectedName));
	}
  @Test
  void checkCustomerId() {
	  Customer generator = new Customer(203,"Varun");
	  int expectedId = 204;
	  int id = generator.getId();
	  assertTrue(id==expectedId);
  }
}
