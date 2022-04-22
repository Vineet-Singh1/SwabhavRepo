package com.monocept.model;

public class Test {

	public static void main(String[] args) {
//		String page = new StringBuilder().append("<html>").append("<h1>").append("Hello").append("</h1>").toString();
//		System.out.println(page);

		LaptopSystem laptop = new LaptopBuilder()
				.addKeyboard("keyboard")
				.addHDD("50Gb").addMouse("mouse")
				.addRam("16Gb")
				.addTouchScreen("touchScreen")
				.getSystem();
		System.out.println(laptop.toString());
	}

}
