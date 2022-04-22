package com.monocept.model6;

public class Account {
	private double principle;
	private double year;
	final static double RATE;

	static {
		RATE = 0.05;
	}

	public Account(double principle, double year) {
		this.principle = principle;
		this.year = year;

	}

	public double getInterest() {
		return (this.principle * this.year * RATE);
	}
}
