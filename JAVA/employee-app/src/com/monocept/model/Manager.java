package com.monocept.model;

public class Manager extends Employee {

	private double hra;
	private double da;
	private double ta;

	public Manager(int eno, String ename, double basic) {
		super(eno, ename, basic);
		this.hra = 50 * PERCENT * basic;
		this.da = 20 * PERCENT * basic;
		this.ta = 10 * PERCENT * basic;

	}

	@Override
	public double calcAnnualCTC() {
		return (this.basic + this.hra + this.da + this.ta) * 12;
	}

	@Override
	public String otherSalary() {

		return ("Hra: " + this.hra + "\n" + "Da: " + this.da + "\n" + "Ta: " + this.ta);
	}

}
