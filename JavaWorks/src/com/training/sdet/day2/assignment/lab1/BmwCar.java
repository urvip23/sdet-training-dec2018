package com.training.sdet.day2.assignment.lab1;

public class BmwCar extends Car{
	private double mileage;

	public BmwCar(double mileage, int door, int capacity, int speed) {
		super(door, capacity, speed);
		this.mileage = mileage;
	}
	
	public double mileage(){
		return 32.0;
		//System.out.println("My BMW car mileage is " + this.mileage);
	}

}
