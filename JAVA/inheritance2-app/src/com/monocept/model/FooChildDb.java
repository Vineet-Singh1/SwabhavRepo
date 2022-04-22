package com.monocept.model;

public class FooChildDb extends FooDb {
	@Override
	public void read() {
		System.out.println("FooChildDb is Reading");

	}

	@Override
	public void update() {
		System.out.println("FooChildDb  is updating");

	}

	@Override
	public void delete() {
		System.out.println("FooChildDb  is deleting");

	}
}
