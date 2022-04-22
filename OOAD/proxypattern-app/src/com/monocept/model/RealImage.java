package com.monocept.model;

public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		System.out.println("loading..." + this.fileName);
	}

	@Override
	public void display() {
		System.out.println("displaying " + this.fileName);
	}

}
