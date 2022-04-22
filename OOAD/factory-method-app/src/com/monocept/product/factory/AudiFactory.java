package com.monocept.product.factory;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory factory;

	private AudiFactory() {
		System.out.println("Inside Bmw factory constructor");
	}

	@Override
	public IAuto make() {
		IAuto auto = new Audi();
		return auto;
	}
	
	public static AudiFactory getInstance() {
		if (factory == null) {
			synchronized (BmwFactory.class) {
				if (factory == null) {
					factory = new AudiFactory();
				}

			}
		}
		return factory;
	}

}
