package srp.solution;

public class InvoicePrinter {

	public static void voicePrinter(Invoice in) {
		String invoice = "id: " + in.getId() + " description: " + in.getDescription() + "  amount:" + in.getAmount()
				+ " discount: " + in.calculateDiscount() + " Tax: " + in.calculateTax() + "  total amount: "
				+ in.total();
		System.out.println(invoice);
	}
}
