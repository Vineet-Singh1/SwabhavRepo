package com.monocept.product.factory;

public class TeslaFactory implements IAutoFactory {
	private static TeslaFactory factory;

	private TeslaFactory() {
		System.out.println("inside the audi factory method");
	}

	@Override
	public IAuto make() {
		IAuto auto = new Tesla();
		return auto;
	}
	
	public static TeslaFactory getInstance() {
		if (factory == null) {
			synchronized (BmwFactory.class) {
				if (factory == null) {
					factory = new TeslaFactory();
				}

			}
		}
		return factory;
	}

}
