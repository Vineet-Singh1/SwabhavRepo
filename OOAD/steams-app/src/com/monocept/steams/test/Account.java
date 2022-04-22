package com.monocept.steams.test;

public class Account {
	private int accno;
	private String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}

	public void deposit(double amt) {
		this.balance += amt;

	}

	public void withdraw(double amt) {
		this.balance -= amt;

	}

	public int getAccountNo() {
		return this.accno;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

}
