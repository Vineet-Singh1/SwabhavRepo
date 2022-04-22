package com.monocept.model.test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.moonocept.model.Account;

public class SerializeObjectTest {

	public static void main(String[] args) throws IOException {

		Account[] accounts = new Account[3];
		accounts[0]=new Account(101,"Jitin",5000);
		accounts[1]= new Account(201,"Manish",1200);
		accounts[2]=new Account(301,"Depak");
		
		for(Account account:accounts) {
			account.deposit(3000);
			account.withdrawl(500);
		System.out.println("Details before serilization: AccountNo:"+account.getAccno()+
	          " Name: "+account.getName()+" Balance: "+account.getBalance());
		}
		File f = new File("account.bin");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accounts);
		fos.close();
		oos.close();
		
	}
	}
