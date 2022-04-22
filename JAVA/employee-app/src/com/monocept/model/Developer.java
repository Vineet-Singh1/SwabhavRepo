package com.monocept.model;

public class Developer extends Employee {

	private double pib;
	private double otb;

	public Developer(int eno, String name, double basic) {
		super(eno, name, basic);
		pib = this.basic * 40 * PERCENT;
		otb = this.basic * 30;
	}

	@Override
	public double calcAnnualCTC() {

		return (this.basic + this.pib + this.otb)*12;
	}

	@Override
	public String otherSalary() {
		
		return ("pib : "+this.pib+"\n"+"otb: "+this.otb);
	}

}
