package com.fdp.beans;

public class Hondai implements Car {

	
	
	public   Hondai() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public String carName() {

		return "Car Name : Hondai";
	}

	@Override
	public String carColor() {
		return "Car Color : Navi-Blue";
	}

	@Override
	public String carEngine() {
		
		return "Car Engine : 420 cc";
	}

	@Override
	public String carStaring() {
		
		return "Car Stairing : Power Stairing";
	}
	public void getHyndaiInfo()
	{
		
		System.out.println("new method added...");
	}
}
