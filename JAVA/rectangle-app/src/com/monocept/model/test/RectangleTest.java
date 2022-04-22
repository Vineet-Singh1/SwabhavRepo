package com.monocept.model.test;

import com.monocept.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();

		small.width = 5;
		small.height = 10;
		big.width = 50;
		big.height = 100;
		System.out.println("Area of small rectangle:" + small.calculateArea());
		System.out.println("Area of Big rectangle:" + big.calculateArea());

	}

}
