package com.monocept.product.factory;

 class Bmw implements IAuto {

	@Override
	public void start() {
		System.out.println("Bmw is running");

	}

	@Override
	public void stop() {
		System.out.println("Bmw is stopped");

	}
}
