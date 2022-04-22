package com.monocept.model.test;

import com.monocept.model.*;

public class AccountTest {

	private static void printDetails(Account acc) {
		System.out.println(acc.getClass().getSimpleName()+" : "+"Account Number: " + acc.getAccountNo() + " " + "Name: " + acc.getName() + " " + "Balance: "
				+ acc.getBalance());
	}
	private static void printDetails(Account[] acc) {
		for(Account account : acc) 
			printDetails(account);
	}

	public static void main(String[] args) {
		Account[] acc = {new SavingsAccount(235, "Ramesh", 5000)
		, new CurrentAccount(454, "Suresh", 7000)};
		for(int i=0;i<acc.length;i++) {
			acc[i].withdraw(500);
		}
		for(Account account: acc) {
		   printDetails(account);
		}
		
	}

}
