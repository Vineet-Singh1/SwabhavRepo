package com.monocept.model.test;

import java.util.function.Function;
import java.util.function.IntFunction;

public class MathOperationTest2 {

	public static void main(String[] args) {
		IntFunction<Long> x;
		x = MathOperationTest2::cubeAnEvenNo;
		System.out.println("Cube of Even:" + x.apply(10));

		Function<Integer, Boolean> y;
		y = MathOperationTest2::checkEven;
		System.out.println("is it even: " + y.apply(10));

	}

	public static long cubeAnEvenNo(int a) {
		return a * a * a;
	}

	public static boolean checkEven(int a) {
		if (a % 2 == 0)
			return true;
		return false;
	}
}
