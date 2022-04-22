package com.monocept.model.test;

import com.monocept.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r;
		r = new Rectangle();
		r.setWidth(100);
		r.setHeight(10);
		System.out.println("The width of the rectangle is:" + r.getWidth());
		System.out.println("The height is: " + r.getHeight());
		System.out.println("the area is :" + r.calcArea());

	}

}
