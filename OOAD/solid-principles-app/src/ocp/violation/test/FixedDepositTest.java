package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("Rohan", 100000, 10, FestivalType.NEW_YEAR);
		System.out.println("Simple Interest is :" + fd1.calculateSimpleInterest());
	}

}
