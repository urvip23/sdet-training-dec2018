package com.training.sdet.day2;

public class LoanClient {

	public static void main(String[] args) {
		Loan loan = new HomeLoan(101, 1000);
		
		displayLoan(loan);
		
		loan = new VehicleLoan(201,2000);
		
		displayLoan(loan);
			
		loan = new EducationLoan(301,3000);
		
		displayLoan(loan);
		
		String myList [] = {"1", "2", "3"}; 
	}
	
	//Use right click -> Refactor -> Extract method -> Give name

	private static void displayLoan(Loan loan) {
		System.out.println("Name: "+loan.getName());
		System.out.println("Address: "+loan.getAddress());
		System.out.println("ROI "+loan.getROI());
		System.out.println();
	}

}
