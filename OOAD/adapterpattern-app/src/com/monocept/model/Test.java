package com.monocept.model;

import com.monocpt.model.Hat;

public class Test {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.add(new HatAdapter(new Hat("Black","Premium",1000)));
		cart.add(new HatAdapter(new Hat("White","Premium",4000)));
		
		System.out.println(cart.getDetails());

	}

}
