package com.monocept.product.factory;

public class Audi implements IAuto {
	@Override
	public void start() {
		System.out.println("Tesla is starting:");
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stopped:");

	}
}