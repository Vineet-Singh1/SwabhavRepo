package srp.solution.test;

import srp.solution.Invoice;
import srp.solution.InvoicePrinter;

public class SrpSolutionTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("123", "It contains details", 100000, 10f, 20);
		InvoicePrinter.voicePrinter(invoice);

	}

}
