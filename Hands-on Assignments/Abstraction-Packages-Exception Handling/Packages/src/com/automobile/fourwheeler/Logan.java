package com.automobile.fourwheeler;

import com.automobile.Vehicle;
public class Logan extends Vehicle {
	
	private String modelname;
	private String registrationnumber;
	private String ownerName;
	private int speed;
	private int gpsloc;
	
	public Logan(String modelname, String registrationnumber, String ownerName,
			int speed,int gpsloc) {
		super();
		this.modelname = modelname;
		this.registrationnumber = registrationnumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gpsloc = gpsloc;
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
	
	public int gps(){
		return gpsloc;
	}

}
