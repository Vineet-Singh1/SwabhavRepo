package com.monocept.model.test;

import com.monocept.model.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
//		DataService obj1 = DataService.getInstance();
//		obj1.printMessage();
//		obj1.doWork();
//
//		DataService obj2 = DataService.getInstance();
//		obj2.printMessage();
//		obj2.doWork();

		Thread t1 = new Thread(() -> {
			DataService s1 = DataService.getInstance();
			s1.doWork();
		});
		Thread t2 = new Thread(() -> {
			DataService s2 = DataService.getInstance();
			s2.doWork();
		});
		Thread t3 = new Thread(() -> {
			DataService s3 = DataService.getInstance();
			s3.doWork();
		});
		t1.start();
		t2.start();
		t3.start();
	}

}
