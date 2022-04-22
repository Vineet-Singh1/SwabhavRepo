package com.monocept.model;

public class OilChange implements CarService {
	CarService service;

	public OilChange(CarService service) {
		this.service = service;
	}

	@Override
	public double getCost() {

		return 1000+ service.getCost();
	}

}
