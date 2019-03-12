package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
	
	private String modelname;
	private String registrationnumber;
	private String ownerName;
	private int speed;
	
	public Honda(String modelname, String registrationnumber, String ownerName,
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
	
	public void cdplayer(){
		System.out.println("Provides facility to control the cd player device which is available in the car");
	}

}
