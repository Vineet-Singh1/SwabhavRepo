package com.monocept.model.test;

import com.monocept.model.*;

public class PolymorphismTest {

	public static void main(String[] args) {
		doDbOperations(new CustomerDb());
		doDbOperations(new DepartmentDB());
		doDbOperations(new OrderDb());
		doDbOperations(new FooChildDb());
	}

	static void doDbOperations(IDataAccessible obj) {
		System.out.println("Doing Db Operations");
		obj.create();
		obj.update();
		obj.read();
		obj.delete();
	}

}
