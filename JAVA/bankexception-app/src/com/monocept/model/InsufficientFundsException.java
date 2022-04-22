package com.monocept.model;

public class InsufficientFundsException extends RuntimeException {
	private Account acc;

	public InsufficientFundsException(Account acc) {
		this.acc = acc;
//		super("Holder of Account no: " + acc.getAccno() + " Named " + acc.getName() + " tried to withdrawl: "
//				+ acc.getWithdrawl() + " but only has " + acc.getBalance() + " in their Account"
//				+ "\nIt is bank policy to maintain a minimum balance of 500.0");

	}

	@Override
	public String getMessage() {
		String s = "Holder of Account no: " + acc.getAccno() + " Named " + acc.getName() + " tried to withdrawl: "
				+ acc.getWithdrawl() + " but only has " + acc.getBalance() + " in their Account"
				+ "\nIt is bank policy to maintain a minimum balance of 500.0";
		return s;
	}
}
