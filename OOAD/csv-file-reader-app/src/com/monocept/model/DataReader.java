package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DataReader implements IDataSource{
     private String path;
     
     public DataReader(String path) {
    	 this.path= path;
     }
     
    @Override
	public Set<Employee> read() throws FileNotFoundException,IOException {

		Set<Employee> employee = new TreeSet<Employee>(new SortById());
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		try {

			String line = br.readLine();
			if (line == null)
				throw new IllegalArgumentException("File is empty");

			while ((line = br.readLine()) != null) {

				String[] employeeDetails = line.split(",");
				try {

					if (employeeDetails.length > 8)
						throw new ArrayIndexOutOfBoundsException();
					int id = Integer.parseInt(check(employeeDetails[0]));
					String name = check(employeeDetails[1]);
					String job = check(employeeDetails[2]);
					int mgrId = Integer.parseInt(check(employeeDetails[3]));
					String doj = (employeeDetails[4]);
					double salary = Double.parseDouble(check(employeeDetails[5]));
					double commission = Double.parseDouble(check(employeeDetails[6]));
					int deptNo = Integer.parseInt(check(employeeDetails[7]));

					Employee emp = new Employee(id, name, job, mgrId, doj, salary, commission, deptNo);

					employee.add(emp);

				} catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {

					System.out.println(e);
				}
			}
			return employee;
		} finally {
			br.close();
		}
	}

	public static String check(String value) {
		if (value.equalsIgnoreCase("NULL")) {
			return "0";
		}
		return value;
	}

}