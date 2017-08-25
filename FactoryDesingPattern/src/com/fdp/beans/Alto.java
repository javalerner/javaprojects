package com.fdp.beans;

public class Alto implements Car{

	public void getAltoDetails()
	{
		
		System.out.println("new method added...");
	}
	
	public Alto(){
		super();
	}
	public String carWheels() {
		return "Car Wheels : Updtaed";
	}
	@Override
	public String carName() {
		return "Car Name : Indica";
	}

	@Override
	public String carColor() {
		return "Car Color : White";
	}

	@Override
	public String carEngine() {
		return "Car Engine : 280cc";
	}

	public String carSpeeds() {
		return "Car speed : 280cc";
	}

	public String carDrivingTools() {
		return "carDrivingTools";
	}
	@Override
	public String carStaring() {
    String starting = "Drum Drum....!";
		return starting;
	}
	
	public void getDatas()
	{
		
		System.out.println("new Data found...");
	}
}
