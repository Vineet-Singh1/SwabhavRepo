package com.monocept.model.test;

import com.monocept.model.*;

public class ManBoyTest {

	private static void caseStudy1() {
		Man x;
		x = new Man();
		x.read();
		x.play();
	}

	private static void caseStudy2() {
		Boy y;
		y = new Boy();
		y.play();
		y.eat();
		y.read();
	}

	private static void caseStudy3() {
		Man x;
		x = new Boy();
		x.read();
		x.play();
	}

	private static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());

	}

	private static void caseStudy5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = 10.55f;
		System.out.println(x.getClass());
		x = (10 > 5);
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	}

	private static void atThePark(Man m) {
		System.out.println("At the park");
		System.out.println(m.getClass());
		m.play();
	}

	public static void main(String[] args) {
		caseStudy1();
		caseStudy2();
		caseStudy3();
		caseStudy4();
		caseStudy5();
		
	}

}
