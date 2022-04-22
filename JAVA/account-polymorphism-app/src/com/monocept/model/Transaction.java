package com.monocept.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	private int transactionId;
	private String dateTime;
	private double transactionAmount;

	public Transaction(double amt) {
		this.transactionId = (int) (Math.random() * 6000) + 1;
		this.transactionAmount = amt;
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		LocalDateTime now = LocalDateTime.now();
		this.dateTime = dateTime.format(now);
	}

	@Override
	public String toString() {
		return "transaction id: " + transactionId + " ,transaction date and time=" + dateTime + ", transactionAmount="
				+ transactionAmount + "\n";
	}

}
