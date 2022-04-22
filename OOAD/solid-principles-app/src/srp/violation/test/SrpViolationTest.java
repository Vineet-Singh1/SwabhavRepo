package srp.violation.test;

import srp.violation.Invoice;

public class SrpViolationTest {

	public static void main(String[] args) {
		Invoice obj = new Invoice("123", "It contains details", 100000, 10f, 20);
		obj.printInvoice();

	}

}
