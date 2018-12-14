package com.training.sdet.day2;

public class EducationLoan extends Loan {
	
	public EducationLoan(int loanId, int loanAmount) {
		// TODO Auto-generated constructor stub
		super(loanId, loanAmount);
		//super(loanAmount);
	}

	@Override
	public double getROI() {
			return 5.5;
	}

}
