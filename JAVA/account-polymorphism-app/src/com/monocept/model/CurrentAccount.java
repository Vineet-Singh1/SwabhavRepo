package com.monocept.model;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);

	}

	@Override
	public void withdraw(double amt) {
		if (this.balance - amt > -10000) {
			this.balance -= amt;
			System.out.println("Amount Withdrawl of " + amt);
		}
	}

	}


