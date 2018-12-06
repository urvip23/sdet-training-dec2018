package com.training.sdet.day2.assignment.lab1;

import com.training.sdet.day2.Loan;

public class VehicleLoan extends Loan{
	
	public VehicleLoan(int loanId, int loanAmount) {
		// TODO Auto-generated constructor stub
		super(loanId, loanAmount);
		//super(loanAmount);
	}

	@Override
	public double getROI() {
		return 11.5;
	}

}
