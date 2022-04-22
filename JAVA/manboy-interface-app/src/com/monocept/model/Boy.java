package com.monocept.model;

public class Boy implements IMannerable, IEmotionable{

	@Override
	public void wish() {
		System.out.println("Boy wishes Hello");
		
	}

	@Override
	public void depart() {
		System.out.println("Boy departing good bye");
		
	}

	@Override
	public void cry() {
		System.out.println("Boy is Crying");
		
	}

	@Override
	public void laugh() {
		System.out.println("Boy is laughing");
	}

}
