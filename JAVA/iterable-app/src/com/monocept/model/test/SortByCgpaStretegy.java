package com.monocept.model.test;

import java.util.Comparator;

import com.monocept.model.Student;

public class SortByCgpaStretegy implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getCgpa() == s2.getCgpa())
			return 0;
		if(s1.getCgpa()>s2.getCgpa())
		return 1;
		return -1;

	}

}
