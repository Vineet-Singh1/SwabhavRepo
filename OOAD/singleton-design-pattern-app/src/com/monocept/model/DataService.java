package com.monocept.model;

public class DataService {
	private static DataService service;

	private DataService() {
		System.out.println("Inside the data Service constructor");
	}

	public static DataService getInstance() {
		if (service == null) {
			service = new DataService();
		}
		return service;
	}
	public void doWork() {
		System.out.println("do Work is called: "+this.service.hashCode());
	}

	public void printMessage() {
		System.out.println(this.hashCode());
	}
}
