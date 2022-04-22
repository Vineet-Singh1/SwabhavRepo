package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.moonocept.model.Account;

public class DeserializeObjectTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("account.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account[] accounts = (Account[]) ois.readObject();

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Details after deserilization: AccountNo:" + accounts[i].getAccno() + " Name: "
					+ accounts[i].getName() + " Balance: " + accounts[i].getBalance());
		}
		fis.close();
		ois.close();
	}

}
