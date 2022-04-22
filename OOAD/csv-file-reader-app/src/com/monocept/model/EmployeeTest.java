package com.monocept.model;

import java.io.IOException;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {
		DataAnalyser analyser = new DataAnalyser(new DataReader("resources//dataFile.txt"));
		System.out.println(analyser.findCeo());
		System.out.println(analyser.employeeCountByDesignation());
		System.out.println(analyser.getEmployeeCountByDeptNo());
	}
}