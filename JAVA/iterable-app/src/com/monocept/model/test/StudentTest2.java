package com.monocept.model.test;

import java.util.HashMap;
import java.util.Map;

import com.monocept.model.Student;

public class StudentTest2 {

	public static void main(String[] args) {
		Map<Student, Student> students = new HashMap<>();
		Student s1 = new Student(101, "ROHAN", "Sahu", 8, 9.8);
		Student s2 = new Student(101, "rohan", "Sahu", 8, 9.8);
		Student s3 = new Student(101, "rohan", "Sahu", 8, 9.8);
		
		
	}

}
