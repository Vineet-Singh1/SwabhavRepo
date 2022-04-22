package com.monocept.model;

public class DepartmentDB implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("Department is Reading");
		
	}

	@Override
	public void create() {
		System.out.println("Department is Creating");
		
	}

	@Override
	public void update() {
		System.out.println("Department is updating");
		
	}

	@Override
	public void delete() {
		System.out.println("Department is deleting");
		
	} 

}
