package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		caseStudy2();
		System.out.println("End of main");

	}

	private static void caseStudy2() {
		try {
			caseStudy1();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void caseStudy1() {
		Account acc1 = new Account(101, "Rohan", 1000);
		acc1.withdrawl(500);
		printDetails(acc1);

		Account acc2 = new Account(102, "Vishnu", 1000);
		acc2.withdrawl(600);
		printDetails(acc2);
	}

	private static void printDetails(Account acc1) {
		System.out.println("Name of the Account Holder: " + acc1.getName());
		System.out.println("Account no is:" + acc1.getAccno());
		System.out.println("Account Balance is:" + acc1.getBalance());
	}
}
