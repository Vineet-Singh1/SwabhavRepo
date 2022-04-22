package com.monocept.model.test;

import com.monocept.model.MagicNumber;

public class MagicNumberTest {

	private static double noOfDozens(int noOfFruits) {
   	 int Dozens= noOfFruits/MagicNumber.oneDozen;
   	 return Dozens;
    }
	
	
	public static void main(String[] args) {
     System.out.println("Dozens of fruit you brought:"+noOfDozens(60));

	}

}
