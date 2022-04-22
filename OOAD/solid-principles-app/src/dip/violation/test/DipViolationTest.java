package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class DipViolationTest {

	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(LogType.FILE);
        System.out.println(calc.calculateTax(10,2));
        System.out.println(calc.calculateTax(10, 0));
        System.out.println(calc.calculateTax(10, 5));
        
        
       TaxCalculator cal2 = new TaxCalculator(LogType.DB);
       System.out.println(cal2.calculateTax(10, 2));
       System.out.println(cal2.calculateTax(10, 0));
       System.out.println(cal2.calculateTax(10, 5));
	}

}
