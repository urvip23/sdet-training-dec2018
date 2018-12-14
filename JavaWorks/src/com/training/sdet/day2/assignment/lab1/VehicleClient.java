package com.training.sdet.day2.assignment.lab1;

public class VehicleClient {
	
	public static void display(Vehicle v) {
		System.out.println("--------------------------------------------");
		v.move();
		v.brake();
		
		if(v instanceof BmwCar){
				((Car)v).doors();
				((Car)v).fuelCapacity();
				((BmwCar)v).mileage();
				
		}else if (v instanceof Truck){
				((Truck)v).load();
				((Truck)v).totalLength();	
		}
	}
	
	
	public static void main(String[] args){
		//singleObjectCall();
		
		Vehicle [] vehicles = new Vehicle[4];
		
		//Car bmw = new BmwCar(40);
		//Car c = new BmwCar();
		
		//c = BmwCar(40,4,20,75);
		vehicles[0] = new Truck(4000, 51, 65);
		vehicles[1] = new BmwCar(40,4,20, 75);
		vehicles[2] = new Truck(1500, 49, 40);
		vehicles[3] = new BmwCar(10, 70, 130, 80);
		
//		
//		for(int i=0; i<vehicles.length; i++){
//			display(vehicles[i]);
//		}
		
		//System.out.println("My BMW car gives " + c.mileage() + " miles/hr");
		
	
		 //Better way to print array variables - better syntactically
		for(Vehicle temp : vehicles) {
			display(temp);
		}
		
		
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Vehicle v = new Car(4, 40, 120);
//		display(v);
//			
//		//System.out.println("--------------------------------");
//		v = new Truck(4000, 51, 65);
//		display(v);
//
//	}

}
