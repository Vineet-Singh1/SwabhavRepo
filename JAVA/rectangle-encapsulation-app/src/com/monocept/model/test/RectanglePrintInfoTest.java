package com.monocept.model.test;

import com.monocept.model.*;

public class RectanglePrintInfoTest {

	public static void printDetails(Rectangle r) {
		System.out.println("Width of the rectangle is:" + r.getWidth());
		System.out.println("Height of the rectangle is:" + r.getHeight());
		System.out.println("Area of the rectagle is:" + r.calcArea());
	}

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(-20);
		printDetails(r1);

		Rectangle r2 = new Rectangle();

		r2.setWidth(100);
		r2.setHeight(200);
		printDetails(r2);

	}

}
