package com.monocept.subscriber;

import com.monocept.publisher.Account;
import com.monocept.publisher.INotifier;

public class EmailNotifier implements INotifier {

	@Override
	public void notifySubs(Account acc) {
		System.out.println();
		System.out.println("Mail is sent to:");
		System.out.println("Account No:"+acc.getAccountNo());
		System.out.println("Account holder name:"+acc.getName());
		System.out.println("Account Balance:"+acc.getBalance());
		
	}

}
