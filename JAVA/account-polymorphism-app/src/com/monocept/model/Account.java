package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
	private int accno;
	private String name;
	protected double balance;
	protected String accountType;
	Transaction transaction;
	List<Transaction> allTransactions = new ArrayList<>();

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public List<Transaction> getallTransactions() {
		return allTransactions;
	}

	public void deposit(double amt) {
		this.balance += amt;
		transaction = new Transaction(amt);
		allTransactions.add(transaction);

	}

	public Transaction getTransaction() {
		return this.transaction;
	}

	public abstract void withdraw(double amt);

	public int getAccountNo() {
		return this.accno;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

//	public void setTransaction(Account acc, String amt) {
//		transactions += "\n\nName: " + acc.getName() + "\nBalance: " + acc.getBalance() +"\n"+ amt
//				+ "\nAccount Type: " + acc.getClass().getSimpleName() + "\nDate and Time: " + acc.getDateTime();
//	}

}
