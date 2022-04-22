package com.monocept.model8;

public class Laptop implements Comparable<Laptop>{
	private String brand;
	private int ram;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Laptop(String brand, int ram, double price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop lap2) {
		if(this.getRam()> lap2.getRam())
		return 1;
		return -1;
	}

}
