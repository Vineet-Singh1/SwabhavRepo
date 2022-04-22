package com.monocept.product.factory;

public class BmwFactory implements IAutoFactory {
   private static BmwFactory factory;
    
   private BmwFactory() {
    	System.out.println("Inside Bmw factory constructor");
    }
	@Override
	public IAuto make() {
		IAuto auto = new Bmw();
		return auto;
	}
	
	public static BmwFactory getInstance() {
		if (factory == null) {
			synchronized (BmwFactory.class) {
				if (factory == null) {
					factory = new BmwFactory();
				}

			}
		}
		return factory;
	}

}
