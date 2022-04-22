package com.monocept.model.test;

public class UnauthorizeExceptionTest {
	public void authorize(String username, String password) {
		if (username.equals("Rohan") && password.equals("rohan123"))
			System.out.println("You are authorized");
		else
			throw new UnauthorizedException("You are not Authorized");

	}

	public static void main(String[] args) {
		UnauthorizeExceptionTest test = new UnauthorizeExceptionTest();
		test.authorize("Rohan", "rohan124");

	}

}
