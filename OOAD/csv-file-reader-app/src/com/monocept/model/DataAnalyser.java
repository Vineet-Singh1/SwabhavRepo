package com.monocept.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataAnalyser {

	private IDataSource dataSource;

	public DataAnalyser(IDataSource source) {
		this.dataSource = source;
	}

	Set<Employee> emp = new HashSet<Employee>();

	public String findCeo() throws FileNotFoundException, IOException {
		emp = dataSource.read();
		for (Employee e : emp) {
			if (e.getMgrId() == 0) {
				return e.getName();
			}
		}
		return null;
	}

	public Map<String, Integer> employeeCountByDesignation() throws FileNotFoundException, IOException {
		emp = dataSource.read();
		Map<String, Integer> count = new HashMap<String, Integer>();
		for (Employee e : emp) {
			if (count.containsKey(e.getJob()))
				count.put(e.getJob(), count.get(e.getJob()) + 1);
			if (!count.containsKey(e.getJob()))
				count.put(e.getJob(), 1);

		}
		return count;
	}

	public Map<Integer, Integer> getEmployeeCountByDeptNo() throws FileNotFoundException, IOException {
		emp = dataSource.read();
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (Employee e : emp) {
			if (count.containsKey(e.getDeptNo()))
				count.put(e.getDeptNo(), count.get(e.getDeptNo()) + 1);
			if (!count.containsKey(e.getDeptNo()))
				count.put(e.getDeptNo(), 1);
		}
		return count;
	}

}
