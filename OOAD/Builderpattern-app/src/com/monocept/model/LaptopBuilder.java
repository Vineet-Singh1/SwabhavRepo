package com.monocept.model;

public class LaptopBuilder {
	LaptopSystem laptop;

	public LaptopBuilder() {
		this.laptop = new LaptopSystem();
	}

	public LaptopBuilder addKeyboard(String type) {
		laptop.keyboard = type;
		return this;
	}

	public LaptopBuilder addRam(String size) {
		laptop.ram = size;
		return this;
	}

	public LaptopBuilder addHDD(String size) {
		laptop.HDD = size;
		return this;
	}

	public LaptopBuilder addMouse(String type) {
		laptop.mouse = type;
		return this;
	}

	public LaptopBuilder addTouchScreen(String type) {
		laptop.touchScreen = type;
		return this;
	}

	public LaptopSystem getSystem() {
		return laptop;
	}
}
