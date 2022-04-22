package com.monocept.model.test1;

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class ArrayVectorTest {

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();

		System.out.println("Initially the capacity of the vector is: " + numbers.capacity());
		numbers.add(23);
		numbers.add(45);
		numbers.add(54);
		numbers.add(98);
		numbers.add(78);
		numbers.add(89);
		numbers.add(49);
		numbers.add(59);
		numbers.add(77);
		numbers.add(33);
		numbers.add(88);
		System.out.println("After adding number more than its capacity: " + numbers.capacity());
       
		
		List<Integer> nums = new ArrayList<>();
		
		System.out.println("Initially list has the size of: "+nums.size());
		nums.add(45);
		nums.add(84);
		nums.add(56);
		nums.add(66);
		System.out.println("Finally the list has the size of: "+nums.size());
	}

}
