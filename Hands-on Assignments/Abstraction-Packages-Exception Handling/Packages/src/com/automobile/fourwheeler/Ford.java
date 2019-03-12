package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
	
	private String modelname;
	private String registrationnumber;
	private String ownerName;
	private int speed;
	private int temp;
	
	public Ford(String modelname, String registrationnumber, String ownerName,
			int speed,int temp) {
		super();
		this.modelname = modelname;
		this.registrationnumber = registrationnumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.temp = temp;
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

	public int speed() {
		return speed;
	}
	
	public int tempControl(){
		return temp;
	}

}
