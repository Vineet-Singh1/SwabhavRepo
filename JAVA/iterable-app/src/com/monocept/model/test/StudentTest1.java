package com.monocept.model.test;

import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.Student;

public class StudentTest1 {

	public static void main(String[] args) {
		Set<Student> students = new TreeSet<Student>(new SortByFirstNameStretegy());

		students.add(new Student(108, "Rahul", "Yadav", 10, 7.5));
		students.add(new Student(101, "Sachin", "Singhal", 12, 8.5));
		students.add(new Student(104, "Pranav", "Dwivedi", 8, 9));
		students.add(new Student(104, "Yash", "Tripathi", 4, 9.8));

		System.out.println("Displaying students in sorted order of firstname");
		printDetails(students);
		System.out.println("\n");

		students = new TreeSet<Student>(new SortByLastNameStretegy());

		students.add(new Student(108, "Rahul", "Yadav", 10, 7.5));
		students.add(new Student(101, "Sachin", "Singhal", 12, 8.5));
		students.add(new Student(104, "Pranav", "Dwivedi", 8, 9));
		students.add(new Student(104, "Yash", "Tripathi", 4, 9.8));

		System.out.println("Displaying students in sorted order of lastname");
		printDetails(students);
		System.out.println("\n");

		students = new TreeSet<Student>(new SortByCgpaStretegy());

		students.add(new Student(108, "Rahul", "Yadav", 10, 6.5));
		students.add(new Student(101, "Sachin", "Singhal", 12, 5.5));
		students.add(new Student(104, "Pranav", "Dwivedi", 8, 9));
		students.add(new Student(104, "Yash", "Tripathi", 4, 8.8));

		System.out.println("Displaying students in sorted order of Cgpa");
		printDetails(students);

	}

	private static void printDetails(Iterable<Student> students) {
		for (Student s : students) {
			System.out.println("First Name: " + s.getFirstName() + " Last Name:" + s.getLastName() + " Roll No: "
					+ s.getRollno() + " Standard:" + s.getStandard() + " Cgpa: " + s.getCgpa());

		}
	}
}
