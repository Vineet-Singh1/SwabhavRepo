package com.monocept.model;

public class BankOverridingTest {
		public static void main(String[] args) {
		HdfcBank h= new HdfcBank();
	    AxisBank a = new AxisBank();
	    SbiBank s = new SbiBank();
	    
		System.out.println("Hdfc Bank Rate of Interest: "+h.getInterestRate());
		System.out.println("Axis Bank Rate of Interest: "+a.getInterestRate());
		System.out.println("Sbi Bank Rate of Interest: "+s.getInterestRate());
		}
	}
