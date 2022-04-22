package com.monocept.model;

public class Test {

	public static void main(String[] args) {
		Image img1 = new RealImage("one.jpg");
		Image img2 = new RealImage("two.jpg");
		Image img3 = new RealImage("three.jpg");
		img3.display();
		
		
		Image img4 = new ProxyImage("four.jpg");
		Image img5 = new ProxyImage("five.jpg");
		Image img6 = new ProxyImage("six.jpg");
		img6.display();
	}

}
