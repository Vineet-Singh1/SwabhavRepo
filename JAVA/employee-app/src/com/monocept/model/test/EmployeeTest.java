package com.monocept.model.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.monocept.model.*;

public class EmployeeTest {

	private static void printPaySlips(Employee emp) throws IOException {
		File file = new File("resources//" + emp.getEname() + " " + emp.getEno() + " .html");
		FileWriter f = new FileWriter(file);

		f.write("<html>\r\n" + "<head>Employee Salary Slips: </head>\r\n" + "<body>\r\n" + "\nEmployee id: "
				+ emp.getEno() + "\n" + "\nEmployee name: " + emp.getEname() + "\n" + "Position: "
				+ emp.getClass().getSimpleName() + "\n" + emp.otherSalary() + "\n" + "\ntotal Ctc: "
				+ emp.calcAnnualCTC());

		f.close();
	}

	private static void printDetails(Employee emp) {
		System.out.println("Employee id " + emp.getEno() + "\n" + "Employee name: " + emp.getEname() + "\n"
				+ "Position: " + emp.getClass().getSimpleName() + "\n" + emp.otherSalary() + "\n" + "total Ctc: "
				+ emp.calcAnnualCTC() + "\n" + "\n");
	}

	public static void main(String[] args) throws IOException {
		Employee[] emp = { new Manager(234, "Rajesh", 5000), new Developer(254, "Manish", 6000),
				new Accountant(345, "Rakesh", 7000) };

		for (Employee employee : emp) {
			printDetails(employee);
			printPaySlips(employee);
		}
	}

}
