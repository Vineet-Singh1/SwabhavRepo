package com.monocept.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListner implements ActionListener {
	public DevilListner() {
		actionPerformed(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("You are in the Devil Listner");

	}

}
