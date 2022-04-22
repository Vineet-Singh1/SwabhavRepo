package ocp.violation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public float calculateRate() {
		double rate;
		if (this.festival.equals("NEW_YEAR")) {
			rate = 0.07;
			return (float) (principal * rate * duration);
		}
		if (this.festival.equals("NORMAL")) {
			rate = 0.08;
		}
		if (this.festival.equals("EID")) {
			rate = 0.09;
		}
		return 1;

	}

	public double calculateSimpleInterest() {
		return this.principal * this.duration * calculateRate() * 0.01;
	}

}
