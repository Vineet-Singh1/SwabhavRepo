package com.monocept.model;

public class TyreRotation implements CarService {
	CarService service;

	public TyreRotation(CarService service) {
		this.service = service;
	}

	@Override
	public double getCost() {
		return 340+ service.getCost();
	}

}
