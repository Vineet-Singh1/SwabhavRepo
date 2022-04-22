package com.monocept.model.test;

import com.monocept.model.AddOperation;
import com.monocept.model.IMathOperation;

public class MathOperationTest {

	public static void main(String[] args) {
		IMathOperation x;
		x = new AddOperation();
		System.out.println("result of addition " + x.doOperation(10, 30));

		x = new IMathOperation() {
			@Override
			public long doOperation(int a, int b) {
				return a - b;
			}
		};
		System.out.println("result of subtraction" + x.doOperation(10, 5));

		x = (n1, n2) -> (long) n1 * n2;
		System.out.println("multiplication " + x.doOperation(12, 3));
		
		x = MathOperationTest::m1;
		System.out.println("result of division: "+x.doOperation(10, 2));
		
	}

	static long m1(int a, int b) {
		return a / b;
	}
}
