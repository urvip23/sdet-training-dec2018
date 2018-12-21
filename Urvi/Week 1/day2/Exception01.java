package com.training.sdet.day2;

public class Exception01 {
	public static void main(String[] args) {
	  try {
		
		//abort call  
		//1 Try block can have multiple catch blocks
		try {
		int arr[] = new int[-5];
	  	}catch(NegativeArraySizeException nase){
	  		System.out.println(nase);
	  		}
		
			int n1 = Integer.parseInt(args[0]); //Parse string into int
			int n2 = Integer.parseInt(args[1]); //Parse string into int
		
			int div = n1 / n2;
			System.out.println("Division result is " + div);
			System.out.println();
		}catch(ArithmeticException ae){
			System.err.println("Division problem: " + ae);
			System.out.println();
		}
		catch(NumberFormatException nfe){
			System.err.println("Please pass only integers : " + nfe);
			System.out.println();
		}		
		catch(Exception e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}finally { //There can be only one Finally for a Try block either for Arithmetic or number
			System.out.println("This is Finally"); 
		}
		
		System.out.println("Please print this other business logic..");
		
	}

}
