package com.monocept.model;

public class Students extends Person {
	private String branch;

	public Students(int id, String address, String dob,String branch) {
		super(id,address,dob);
		this.branch = branch;
		
	}
	public void details() {
		System.out.println("Branch: "+this.branch);
	}
	
}
