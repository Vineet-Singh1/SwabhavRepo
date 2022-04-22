package com.monocept.model.test;

import com.monocept.model.*;

public class RectangleArrayTest {

	public static void print(Rectangle r) {
		System.out.println("width of the rectangle is:" + r.getWidth());
		System.out.println("width of the rectangle is:" + r.getHeight());
		System.out.println("Area of the rectangle is:" + r.calcArea());

	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.setWidth(10);
		r1.setHeight(20);
		r2.setWidth(12);
		r2.setHeight(15);
		
		Rectangle[] manyRectangles = new Rectangle[3];
		manyRectangles[0] = r1;
		manyRectangles[1] = r2;
		manyRectangles[2] = new Rectangle();
		manyRectangles[2].setHeight(50);
		manyRectangles[2].setWidth(20);

		for (Rectangle r : manyRectangles) {
			print(r);
		}
	}

}
