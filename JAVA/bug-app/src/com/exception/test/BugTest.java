package com.exception.test;

public class BugTest {

	public static void main(String[] args) {
		try {
			int firstNo = Integer.parseInt(args[0]);
			int secondNo = Integer.parseInt(args[1]);

			int result = firstNo / secondNo;

			System.out.println("Result is " + result);
		}
//		catch(Exception e) {
//			System.out.println("Exception caught");
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound");
		} finally {
			System.out.println("Important information to know");
		}
		System.out.println("end of the program");

	}

}
