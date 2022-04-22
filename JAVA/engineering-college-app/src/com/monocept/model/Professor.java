package com.monocept.model;

public class Professor extends Person {
	private int basic;
	private double salary;

	public Professor(int id, String address, String dob,double salary) {
		super(id, address, dob);
        this.salary=salary;
	}

	public void salaryCalculation(int basic) {
		this.basic = basic;
		this.salary = basic + basic * 0.05;

	}

	public void details() {
		System.out.println("Salary is : "+this.salary);
	}
}
