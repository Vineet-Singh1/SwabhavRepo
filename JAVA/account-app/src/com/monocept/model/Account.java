package com.monocept.model;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private final static int MIN_BALANCE = 500;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNumber, String name) {
		this(accountNumber, name, MIN_BALANCE);
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdrawl(double amount) {
		if (this.balance - amount > 500) {
			this.balance = this.balance - amount;
		}
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	
	public double getAccno() {
		return this.accountNumber;

	}

}
