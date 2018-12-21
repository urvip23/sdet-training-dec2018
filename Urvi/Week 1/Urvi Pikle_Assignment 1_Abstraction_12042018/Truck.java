package com.training.sdet.day2;

public class Truck extends Vehicle{
	
	
	private int noOfPounds;
	private int noOfFt;
	
	public Truck(int noOfPounds, int noOfFt, int speed){
		super(speed);
		this.noOfPounds = noOfPounds;
		this.noOfFt = noOfFt;
	}
	
	public void load() {
		System.out.println("Truck has " + this.noOfPounds + " lbs.");
	}

	public void totalLength() {
		System.out.println("Truck is " +this.noOfFt + " ft in length.");
	}

	@Override
	public void move() {
		System.out.println("My truck is moving at speed " + this.getSpeed() + "mph.");
	}

	@Override
	public void brake() {
		System.out.println("Truck applies brake to stop.");
	}

	
}
