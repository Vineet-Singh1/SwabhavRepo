package com.monocept.game;

import java.util.Scanner;

public class NumberGuesserObjectTest {

	public static void main(String[] args) {

		char ch;
		Scanner obj = new Scanner(System.in);
		NumberGuesserObject p1;
		do {
			p1 = new NumberGuesserObject();
			System.out.println("Enter the number from 0-100");
			p1.check();
			System.out.println("Play Again:Y/N");

			ch = obj.next().charAt(0);
		} while (ch == 'Y');
		obj.close();

	}

}
