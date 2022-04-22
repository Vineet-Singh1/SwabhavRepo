package ocp.solution.test;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("Rohan", 100000, 10, new HoliFestivalRate());
		System.out.println("Holi festival season: " + fd1.calculateSimpleInterest());

		FixedDeposit fd2 = new FixedDeposit("Rohan", 100000, 10, () -> {
			System.out.println("Diwali Season");
			return 11f;
		});
		System.out.println(fd2.calculateSimpleInterest());

		FixedDeposit fd3 = new FixedDeposit("Rohan", 100000, 10, FixedDepositTest::ramZanFestival);
		System.out.println(fd3.calculateSimpleInterest());
	}

	public static float ramZanFestival() {
		System.out.println("RamZan Season");
		return 12f;
	}
}
