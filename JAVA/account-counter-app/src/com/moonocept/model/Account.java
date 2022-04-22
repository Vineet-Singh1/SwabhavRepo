package com.moonocept.model;

import java.io.Serializable;

public class Account implements Serializable{
	private int accountNumber;
	private transient String name;
	private double balance;
    private static int counter;
    
    private final static int MIN_BALANCE = 500;
    
	public Account(int accountNumber, String name, double balance) {
		System.out.println("inside constructor");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.counter++;
		
	}
	
	static {
		counter=100;
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
	public int getCounter() {
		return counter;
	}
	public static int headCount() {
		return counter;
	}

}
