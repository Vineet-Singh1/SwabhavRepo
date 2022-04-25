package com.monocept.frame;

import javax.swing.JFrame;

public class WelcomeFrame {
	private JFrame frame;

	public WelcomeFrame() {
		this("WELCOME");
//		frame = new JFrame("WELCOME");
		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 600);
//		frame.setLayout(null);
//		frame.setVisible(true);
	}

	public WelcomeFrame(String message) {
		
		frame = new JFrame(message);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
