package com.monocept.model.test;

import com.monocept.com.OddEvenGenerator;

public class OddEvenTest {

	public static void main(String[] args) {
		OddEvenGenerator generator = new OddEvenGenerator();
       int[] values= generator.getOddNoTill(14);
       for(int value: values) {
    	   System.out.println(value);
       }
	}

}
