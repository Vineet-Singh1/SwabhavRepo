package com.monocept.factory;

class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Audi is running");

	}

	@Override
	public void stop() {
		System.out.println("Audi is stopped");

	}

}
