package com.monocept.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accno;
	private String name;
	protected double balance;
	private List<INotifier> notifier = new ArrayList<INotifier>();
	

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance += amt;
		notifySubscriber();
		
	}

	public void withdraw(double amt) {
		this.balance -= amt;
		notifySubscriber();
	}

	public int getAccountNo() {
		return this.accno;
	}

	public String getName() {
		return this.name;
	}

	public void registerNotifier(INotifier notify) {
		notifier.add(notify);
	}

	public double getBalance() {
		return this.balance;
	}

	public List<INotifier> getNotifier() {
		return notifier;
	}

	public void notifySubscriber(){
		for (INotifier notif : notifier) {
			notif.notifySubs(this);
		}
	}

}
