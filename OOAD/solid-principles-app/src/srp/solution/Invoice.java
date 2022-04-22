package srp.solution;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private float tax;
	private double discountPercent;

	public Invoice(String id, String description, double amount, float tax, double discountPercent) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public double calculateTax() {
		return this.amount * 0.01 * this.tax;
	}

	public double calculateDiscount() {
		return this.amount * 0.01 * this.discountPercent;
	}

	public double total() {
		double totalAmount = amount - calculateTax() - calculateDiscount();
		return totalAmount;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}
}
