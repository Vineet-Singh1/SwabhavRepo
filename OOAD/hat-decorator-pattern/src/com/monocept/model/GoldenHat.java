package com.monocept.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(Hat hat) {
		super(hat);

	}

	@Override
	public String getName() {
		return hat.getName() + "  Golden Hat";
	}

	@Override
	public double getPrice() {

		return hat.getPrice() + 1000;
	}

	@Override
	public String getDescription() {

		return hat.getDescription() + "  This hat is Golden Hat";
	}

}
