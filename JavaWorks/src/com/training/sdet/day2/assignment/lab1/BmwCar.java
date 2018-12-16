package com.training.sdet.day2.assignment.lab1;

public class BmwCar extends Car{
	private double mileage;

	public BmwCar(int door, int capacity, int speed) {
		super(door, capacity, speed);
		//this.mileage = mileage;
	}
	
	public double mileage(){
		return 22.0;
		//System.out.println("My BMW car mileage is " + this.mileage);
	}
	
	public void move(){
		System.out.println("My BMW car is moving at speed " + this.getSpeed() + " mph.");
	}

}
