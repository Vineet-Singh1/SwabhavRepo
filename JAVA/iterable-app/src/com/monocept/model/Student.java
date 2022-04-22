package com.monocept.model;

public class Student {
	private int rollno;
	private String firstName;
	private String lastName;
	private int standard;
	private double cgpa;

	public Student(int rollno, String firstName, String lastName, int standard, double cgpa) {
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.standard = standard;
		this.cgpa = cgpa;
	}

	public int getRollno() {
		return rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getStandard() {
		return standard;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int hashCode() {
		int hash = this.rollno;
		return rollno;
	}

	@Override
	public boolean equals(Object ob) {
		Student obj = (Student) ob;
		if (this.rollno == obj.rollno) {
			return true;
		}
		return false;
	}

}
