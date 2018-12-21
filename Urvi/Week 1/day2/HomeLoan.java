package com.training.sdet.day2;

public class HomeLoan extends Loan {

	public HomeLoan(int loanId, int loanAmount) {
		// TODO Auto-generated constructor stub
		super(loanId, loanAmount);
		//super(loanAmount); //Failed if we used super for 2 attributes separately
	}
	
	@Override
	public double getROI() {
		return 8.7;
	}
	
}
