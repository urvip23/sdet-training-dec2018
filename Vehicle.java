package com.training.sdet.day2.assignment.lab1;

public abstract class Vehicle {
	private int speed;
	public Vehicle(int speed) {
		//other jobs can be written here
		this.speed = speed;
	}
	
	public abstract void move();
		//		{
		//System.out.println("Vehicle is moving at " + speed +" mph.");
		//	}
	
	
	public abstract void brake();
		//System.out.println("Vehicle is stopping.");
	

	//Made it protected to made it accessible to the child class only
	protected int getSpeed() {
		return speed;
	}
	
 }


