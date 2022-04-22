package com.monocept.model;

public class OrderDb implements IDataAccessible{

	@Override
	public void read() {
		System.out.println("OrderDb is reading");
		
	}

	@Override
	public void create() {
		System.out.println("OrderDb is Creating");
		
	}

	@Override
	public void update() {
		System.out.println("OrderDb is updating");
		
	}

	@Override
	public void delete() {
		
		System.out.println("OrderDb is deleting");
	}

}
