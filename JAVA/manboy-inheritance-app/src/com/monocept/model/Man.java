package com.monocept.model;

public class Man {
	
	static {
		System.out.println("You are in the Man Static block");
	}
	
   public void read() {
	   System.out.println("Man is Reading");
   }
   public void play() {
	   System.out.println("Man is Playing");
   }
}
