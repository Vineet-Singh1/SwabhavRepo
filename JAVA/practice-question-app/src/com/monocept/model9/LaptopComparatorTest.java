package com.monocept.model9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopComparatorTest {
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 2, 18000));
		laps.add(new Laptop("Apple", 8, 80000));
		laps.add(new Laptop("Lenevo", 4, 16000));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getPrice()>l2.getPrice())
					return 1;
				return -1;
			}
		};
		
		
		
		Collections.sort(laps,com);
		
		for(Laptop lap: laps)
			System.out.println(lap);
}
}