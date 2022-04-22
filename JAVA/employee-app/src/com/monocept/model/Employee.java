package com.monocept.model;

public abstract class Employee {
	private int eno;
	private String ename;
	protected double basic;
	final static double PERCENT = 1 / 100.0;

	public Employee(int eno, String ename, double basic) {
		this.eno = eno;
		this.ename = ename;
		this.basic = basic;
	}

	public int getEno() {
		return this.eno;
	}

	public String getEname() {
		return this.ename;
	}

	public double getBasic() {
		return this.basic;
	}

	public abstract double calcAnnualCTC();

	public abstract String otherSalary();

}
