package com.monocept.subscriber;

import com.monocept.publisher.Account;

public class Test {

	public static void main(String[] args) {
	Account acc1 = new Account(101,"Rohan",5000);
	acc1.registerNotifier(new SmsNotifier());
	acc1.registerNotifier(new EmailNotifier());
	acc1.registerNotifier(new FaxNotifier());
	acc1.deposit(1000);
	acc1.withdraw(500);

	}

}
