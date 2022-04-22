package com.monocept.model;

public class CustomerDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("Customer is Reading");
		
	}

	@Override
	public void create() {
		System.out.println("Customer is Creating");
		
	}

	@Override
	public void update() {
		System.out.println("Customer is updating");
		
	}

	@Override
	public void delete() {
		System.out.println("Customer is deleting");
		
	}

}
