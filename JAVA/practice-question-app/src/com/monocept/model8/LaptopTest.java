package com.monocept.model8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopTest {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 2, 18000));
		laps.add(new Laptop("Apple", 8, 80000));
		laps.add(new Laptop("Lenevo", 4, 16000));
		
		Collections.sort(laps);
		for(Laptop lap: laps)
			System.out.println(lap);
	}

}
