package dip.solution.test;

import dip.solution.DBLogger;
import dip.solution.FileLogger;
import dip.solution.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(new DBLogger());
		System.out.println(calc.calculateTax(10, 2));
		System.out.println(calc.calculateTax(10, 0));

		TaxCalculator cal2 = new TaxCalculator(new FileLogger());
		System.out.println(cal2.calculateTax(10, 2));
		System.out.println(cal2.calculateTax(10, 0));
		System.out.println(cal2.calculateTax(10, 5));
		
		TaxCalculator cal3 = new TaxCalculator((String err)->{System.out.println("Error logged in file" + err);} );
		System.out.println(cal2.calculateTax(10, 2));
		System.out.println(cal2.calculateTax(10, 0));
		System.out.println(cal2.calculateTax(10, 5));
	}

}
