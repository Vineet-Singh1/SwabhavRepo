package com.monocept.model;

public class Circle {
	private float radius;
	private BorderOptions border;

	public Circle(float pRadius) {
		radius = pRadius;
	}

	public Circle(float pRadius, BorderOptions pBorder) {
		radius = pRadius;
		border = pBorder;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public float getRadius() {
		return radius;
	}

	public BorderOptions getBorder() {
		return border;
	}
}
