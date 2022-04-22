package com.monocept.model.test;

import java.util.Comparator;

import com.monocept.model.Student;

public class SortByLastNameStretegy implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getLastName().compareTo(s2.getLastName());

	}

}
