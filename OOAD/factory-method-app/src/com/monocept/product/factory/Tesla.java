package com.monocept.product.factory;

class Tesla implements IAuto {

	@Override
	public void start() {
		System.out.println("Tesla is starting:");
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stopped:");

	}

}
