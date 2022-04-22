package com.monocept.model2;

public class Student2 extends Student1 {
	public Student2() {
		System.out.println("TWO");
	}

	@Override
	void abstractMethod() {
		System.out.println("THREE");
	}
}
