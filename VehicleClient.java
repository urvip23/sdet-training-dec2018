package com.training.sdet.day2.assignment.lab1;

public class VehicleClient {
	
	public static void display(Vehicle v) {
		System.out.println("--------------------------------------------");
		v.move();
		v.brake();
		
		if(v instanceof Car) {
				((Car)v).doors();
				((Car)v).fuelCapacity();
		}else if(v instanceof Truck){
				((Truck)v).load();
				((Truck)v).totalLength();	
			}
	}
	
	public static void main(String[] args){
		//singleObjectCall();
		
		Vehicle [] vehicles = new Vehicle[5];
		
		vehicles[0] = new Car(4, 40, 120);
		vehicles[1] = new Truck(4000, 51, 65);
		vehicles[2] = new Car(2, 25, 95);
		vehicles[3] = new Truck(1500, 49, 40);
		vehicles[4] = new Car(10, 70, 130);
		
//		
//		for(int i=0; i<vehicles.length; i++){
//			display(vehicles[i]);
//		}
	
		// Better way to print array variables - better syntactically
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
