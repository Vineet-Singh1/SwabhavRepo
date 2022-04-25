package com.monocept.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GodListener implements ActionListener {
public GodListener() {
	actionPerformed(null);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("You Clicked on a GodListner");

	}

}
