package com.monocept.model;

public class BmiCalculater {
	private Person person;
	private double bmiScore;

	public BmiCalculater(Person person) {
		this.person = person;
		double height = (person.getHeight() * 0.3040);
		bmiScore = person.getWeight() / (height * height);

	}

	public String bodyCategory() {
		if (bmiScore > 18.5 && bmiScore < 24.9)
			return "Normal";
		if (bmiScore > 25 && bmiScore < 29.9)
			return "OverWeight";
		if (bmiScore > 30 && bmiScore < 39.9)
			return "obese";
		return "Morbidly";
	}

	public double getBmiScore() {
		return bmiScore;
	}

	public String getDetails() {
		String details = person.getName() + " " + person.getAge() + " " + person.getHeight() + " " + person.getWeight()
				+ " " + person.getGender();
		return details;
	}
}
