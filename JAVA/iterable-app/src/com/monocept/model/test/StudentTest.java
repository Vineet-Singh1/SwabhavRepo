package com.monocept.model.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.monocept.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList;
		studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "rohan", "b", 10, 7.5));
		studentList.add(new Student(101, "rohan", "b", 10, 7.5));
		printDetails(studentList);

		Set<Student> studentSet;
		studentSet = new HashSet<Student>();
		studentSet.add(new Student(102, "Ramya", "b", 10, 8.5));
		studentSet.add(new Student(102, "Ramya", "b", 10, 8.5));
		printDetails(studentSet);
	}

	private static void printDetails(Iterable<Student> students) {
		for (Student s : students) {
			System.out.println("First Name: " + s.getFirstName() + " Last Name:" + s.getLastName() + " Roll No: "
					+ s.getRollno() + " Standard:" + s.getStandard() + " Cgpa" + s.getCgpa());

		}
	}

}
