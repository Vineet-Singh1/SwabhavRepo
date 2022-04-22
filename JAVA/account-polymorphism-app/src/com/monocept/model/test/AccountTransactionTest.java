package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.SavingsAccount;
import com.monocept.model.Transaction;

public class AccountTransactionTest {

	public static void main(String[] args) {
		Account acc1 = new SavingsAccount(234, "Vineet", 70000);
		acc1.withdraw(500);
		acc1.deposit(1000);
		System.out.println(acc1.getallTransactions());

	}
}
