package com.monocept.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public interface IDataSource {
	public Set<Employee> read() throws FileNotFoundException, IOException;
}
