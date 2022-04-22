package com.monocept.model;

public abstract class Person {
	private int id;
	protected String address;
	protected String dob;
	protected String branch = "";
	protected double salary = 0.0;

	public Person(int id,String address,String dob)
	{
		this.id = id;
		this.address = address;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}

	
	public String getAddress() {
		return address;
	}


	public String getDob() {
		return dob;
	}

	public abstract void details();
}
