package com.monocept.model.test;

import com.monocept.model.GoldenHat;
import com.monocept.model.Hat;
import com.monocept.model.RibbonedHat;
import com.monocept.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		Hat hat = new RibbonedHat(new GoldenHat(new StandardHat()));
		System.out.println("Hat Name: " + hat.getName());
		System.out.println("Hat Price: " + hat.getPrice());
		System.out.println("Hat Description: " + hat.getDescription());

	}

}
