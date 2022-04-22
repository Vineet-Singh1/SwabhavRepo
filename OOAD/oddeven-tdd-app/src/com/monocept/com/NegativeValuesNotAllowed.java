package com.monocept.com;

public class NegativeValuesNotAllowed extends RuntimeException {
	String message;

	public NegativeValuesNotAllowed(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return message;
	}
}
