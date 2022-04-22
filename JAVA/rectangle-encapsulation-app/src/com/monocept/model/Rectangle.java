package com.monocept.model;

public class Rectangle {

	private int width;
	private int height;

	public void setWidth(int pwidth) {
		width = check(pwidth);
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int pheight) {
		height = check(pheight);
	}

	public int getHeight() {
		return height;
	}

	public int check(int side) {
		if (side > 1 && side < 101)
			return side;
		if (side > 100)
			return 100;
		return 1;

	}

	public int calcArea() {
		return height * width;
	}
}
