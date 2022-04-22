package com.monocept.model7;

public class UnauthorisedExceptionTest {
	public void authorize(String citizenship, int age) {
		if (citizenship.equals("Indian") && age>=18)
			System.out.println("You are authorized to vote");
		else
			throw new UnauthorizedException("You are not Authorized to vote");

	}

	public static void main(String[] args) {
		UnauthorisedExceptionTest test = new UnauthorisedExceptionTest();
		test.authorize("Indian", 14);

	}

}
