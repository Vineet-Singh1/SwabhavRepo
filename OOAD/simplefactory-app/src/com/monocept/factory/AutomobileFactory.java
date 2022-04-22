package com.monocept.factory;

public class AutomobileFactory {
	private static AutomobileFactory factory;

	private AutomobileFactory() {
		System.out.println("Inside Automobile Factory Constructor");
	}

	public static AutomobileFactory getInstance() {
		if (factory == null) {
			synchronized (AutomobileFactory.class) {
				if (factory == null) {
					factory = new AutomobileFactory();
				}

			}
		}
		return factory;
	}

	public IAutoMobile make(AutoType auto) {
		if (AutoType.AUDI == auto)
			return new Audi();
		if (AutoType.TESLA == auto)
			return new Tesla();

		return new Bmw();
	}
}