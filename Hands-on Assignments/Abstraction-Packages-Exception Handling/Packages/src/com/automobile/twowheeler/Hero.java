package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
	
	private String modelname;
	private String registrationnumber;
	private String ownerName;
	private int speed;
	
	public Hero(String modelname, String registrationnumber, String ownerName,
			int speed) {
		super();
		this.modelname = modelname;
		this.registrationnumber = registrationnumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	@Override
	public String getModelName() {
		return modelname;
	}

	@Override
	public String getRegistrationNumber() {
		return registrationnumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void radio(){
		System.out.println("Provides facility to control the radio device.");
	}
}
