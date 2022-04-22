package com.monocept.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;

public class DataReaderUrl implements IDataSource {
	private String address;

	public DataReaderUrl(String add) {
		this.address = add;
	}

	@Override
	public Set<Employee> read() throws FileNotFoundException, IOException {
		Set<Employee> employees = new HashSet<Employee>();
		StringBuilder data = new StringBuilder();
		try {
			URL url = new URL(address);
			URLConnection urlConnection = url.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

			String line = br.readLine();
			if (line == null)
				throw new IllegalArgumentException("File is empty");

			while ((line = br.readLine()) != null) {

				String[] employeeDetails = line.split(",");

				int id = Integer.parseInt(check(employeeDetails[0]));
				String name = check(employeeDetails[1]);
				String job = check(employeeDetails[2]);
				int mgrId = Integer.parseInt(check(employeeDetails[3]));
				String doj = (employeeDetails[4]);
				double salary = Double.parseDouble(check(employeeDetails[5]));
				double commission = Double.parseDouble(check(employeeDetails[6]));
				int deptNo = Integer.parseInt(check(employeeDetails[7]));

				Employee emp = new Employee(id, name, job, mgrId, doj, salary, commission, deptNo);

				employees.add(emp);
			}
			br.close();
		} catch (Exception e) {
		}
		return employees;
	}

	public static String check(String value) {
		if (value.equalsIgnoreCase("NULL")) {
			return "0";
		}
		return value;
	}
}