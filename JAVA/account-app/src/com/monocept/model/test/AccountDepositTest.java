package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountDepositTest {

	public static void main(String[] args) {

		Account acc1 = new Account(101, "asha", 5000);
		acc1.deposit(1000);
		printDetails(acc1);
		Account acc2 = new Account(102, "Ramya");
		acc2.deposit(1000);
		printDetails(acc2);

	}

	private static void printDetails(Account acc) {
		System.out.println("Name of the Account Holder: " + acc.getName());
		System.out.println("Account no is:" + acc.getAccno());
		System.out.println("Account Balance is:" + acc.getBalance());
	}

}
