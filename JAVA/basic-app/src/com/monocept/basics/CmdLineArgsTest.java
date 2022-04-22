package com.monocept.basics;

public class CmdLineArgsTest {

	public static void main(String[] userNames) {
		System.out.println(userNames.length);
		
		for (String userName : userNames) {
			System.out.println(userName);
		}

	}
}
