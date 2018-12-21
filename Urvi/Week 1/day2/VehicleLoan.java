package com.training.sdet.day2;

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
