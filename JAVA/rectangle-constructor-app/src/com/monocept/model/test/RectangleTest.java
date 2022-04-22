package com.monocept.model.test;

import com.monocept.model.*;

public class RectangleTest {
	public static void printDetails(Rectangle small) {
		System.out.println("Width of the rectangle is:" + small.getWidth());
		System.out.println("Height of the rectangle is:" + small.getHeight());
		System.out.println("Area of rectangle is:" + small.calcArea());
		System.out.println("color of rectangle is:" + small.getColor());
	}

	public static void main(String[] args) {
		Rectangle small = new Rectangle(10, 5);
		printDetails(small);
		printDetails(small);
		Rectangle r = new Rectangle(10, 4, "Green");
		printDetails(r);
	}

}
