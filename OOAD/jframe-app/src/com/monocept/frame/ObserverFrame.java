package com.monocept.frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObserverFrame {
	private JFrame frame;

	public ObserverFrame() {
		frame = new JFrame("Observer");
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton("Hello");
		button1.setBounds(180, 50, 80, 80);
		frame.add(button1);
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		button1 = new JButton("Click!");
		
		button1.addActionListener(new GodListener());
		button1.addActionListener(new DevilListner());
	}
}
