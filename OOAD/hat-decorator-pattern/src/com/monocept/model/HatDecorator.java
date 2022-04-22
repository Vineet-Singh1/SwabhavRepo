package com.monocept.model;

abstract class HatDecorator implements Hat {
	Hat hat;

	public HatDecorator(Hat hat) {
		this.hat = hat;
	}

}
