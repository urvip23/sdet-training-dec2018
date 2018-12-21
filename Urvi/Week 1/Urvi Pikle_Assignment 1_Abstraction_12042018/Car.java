package com.training.sdet.day2;

public class Car extends Vehicle{ 
	
	private int doors;
	private int capacity;
	public Car(int doors, int capacity, int speed) {
		super(speed);
		this.doors = doors;
		this.capacity = capacity;
	}
	
	public void doors() {
		System.out.println("Car has " + this.doors + " doors.");
	}
	
	public void fuelCapacity() {
		System.out.println("Car has " + this.capacity + " liters capacity.");
	}

	@Override
	public void move() {
		System.out.println("My car is moving at speed " + this.getSpeed() + "mph.");
	}

	@Override
	public void brake() {
		System.out.println("Car applies brake to stop.");
	}
	
	
	
	
}
