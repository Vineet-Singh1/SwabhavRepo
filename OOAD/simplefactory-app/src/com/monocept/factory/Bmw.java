package com.monocept.factory;

class Bmw implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Bmw is running");

	}

	@Override
	public void stop() {
		System.out.println("Bmw is stopped");

	}

}
