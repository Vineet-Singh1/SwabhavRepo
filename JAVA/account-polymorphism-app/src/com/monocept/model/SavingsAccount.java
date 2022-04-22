package com.monocept.model;

public class SavingsAccount extends Account {

	public SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);

	}

	@Override
	public void withdraw(double amt) {
		if (this.balance - amt > 1000) {
			this.balance -= amt;
			this.transaction = new Transaction(amt);
			allTransactions.add(this.transaction);
		}

	}

}