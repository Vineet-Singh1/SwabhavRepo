package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountWithdrawTest {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "zawed", 5000);
		printDetails(acc1);
		acc1.withdrawl(800);
		printDetails(acc1);

	}

	private static void printDetails(Account acc) {
		System.out.println("Name of the Account Holder: " + acc.getName());
		System.out.println("Account no is:" + acc.getAccno());
		System.out.println("Account Balance is:" + acc.getBalance());
	}

}
