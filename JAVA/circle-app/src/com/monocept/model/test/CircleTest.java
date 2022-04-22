package com.monocept.model.test;

import com.monocept.model.BorderOptions;
import com.monocept.model.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1;
		Circle c2;
		c1 = new Circle(25.5f);
		c2 = new Circle(25.5f, BorderOptions.Dotted);
		printDetails(c1);
		printDetails(c2);
		Circle[] obj = new Circle[2];
		obj[0] = c1;
		obj[1] = c2;
		Circle c3 = findLargestCircle(obj);
		printDetails(c3);
	}

	private static void printDetails(Circle c) {
		System.out.println("the radius of circle:" + c.getRadius());
		System.out.println("the border color of circle is:" + c.getBorder());
		System.out.println("the area of the circle is:" + c.calculateArea());

	}

	private static Circle findLargestCircle(Circle[] circle) {
		Circle maxCircle = circle[0];
		for (int index = 0; index < circle.length; index++) {
			if (circle[index].calculateArea() < circle[index + 1].calculateArea())
				maxCircle = circle[index + 1];
		}
		return maxCircle;
	}

}
