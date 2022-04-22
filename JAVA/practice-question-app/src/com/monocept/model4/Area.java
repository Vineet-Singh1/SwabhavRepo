package com.monocept.model4;

public class Area extends Shape {
	@Override
	public void rectangleArea(double length, double breadth) {
		System.out.println("The Area of Rectangle is: " + (length * breadth));

	}

	@Override
	public void squareArea(double side) {
		System.out.println("The Area of Square is: " + (side * side));

	}

	@Override
	public void circleArea(double radius) {
		System.out.println("The Area of Cirle is: " + (Math.PI * radius * radius));

	}

}
