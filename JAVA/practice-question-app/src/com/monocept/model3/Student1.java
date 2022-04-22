package com.monocept.model3;

public class Student1 extends Marks {
	public Student1(double s1, double s2, double s3) {
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
	}

	@Override
	double getPercentage() {
		return (this.sub1 + this.sub2 + this.sub3)/3.0;
	}
}
