package com.monocept.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.stream.Collectors;

public class DataReaderFile {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("resources//dataFile.txt");

		HashSet<Employee> employeeList = (HashSet<Employee>) Files.lines(path).map(n -> n.split(",")).map(n -> {
			return (new Employee(n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7]));
		}).collect(Collectors.toSet());
      
		employeeList.stream().filter(n->n.getMgrId().contains("NULL")).distinct().forEach(x->{
			System.out.println(x.getName());
		});
	}

}
