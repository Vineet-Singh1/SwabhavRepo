package com.monocept.model3;

public class Student2 extends Marks {
	public Student2(double s1, double s2, double s3, double s4) {
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
	}

	@Override
	double getPercentage() {
		return (this.sub1+this.sub2+this.sub3+this.sub4)/4;
	}

}
