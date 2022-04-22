package com.monocept.model;

public class Rectangle {
	private int width;
	private final int height;
	private String color;

	public Rectangle(int pwidth, int pheight) {
		width = pwidth;
		height = pheight;
		color = "Red";
	}

	public Rectangle(int pwidth, int pheight, String pcolor) {
		width = pwidth;
		height = pheight;
		color = validate(pcolor);
	}

	private String validate(String c) {
		if (c.equalsIgnoreCase("red") || c.equalsIgnoreCase("Blue") || c.equalsIgnoreCase("Green")) {
			return c;
		}
		return "Red";
	}

	public String getColor() {
		return color;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int calcArea() {
		return width * height;

	}
}
