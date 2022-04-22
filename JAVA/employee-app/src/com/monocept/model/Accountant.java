package com.monocept.model;

public class Accountant extends Employee {
	private double perks;

	public Accountant(int eno, String name, double basic) {
		super(eno, name, basic);
		perks = this.basic * PERCENT * 30;
	}

	@Override
	public double calcAnnualCTC() {
		return (this.basic + this.perks)*12;
	}

	@Override
	public String otherSalary() {
		return ("perks "+this.perks);
	}

}
