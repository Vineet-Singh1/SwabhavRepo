package com.monocept.model;

public class RibbonedHat extends HatDecorator {

	public RibbonedHat(Hat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		return hat.getPrice()+340;
	}

	@Override
	public String getDescription() {
		return hat.getDescription()+"  This is a RibbonedHat";
	}

	@Override
	public String getName() {
		
		return hat.getName()+"  Ribboned hat";
	}

}
