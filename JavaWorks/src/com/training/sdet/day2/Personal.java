package com.training.sdet.day2;

public class Personal implements BankLoan{

	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub
		
		System.out.println("Personal Loan applied for " + amount);
	}

	@Override
	public void repay(int repayAmount) {
		// TODO Auto-generated method stub
		System.out.println("For Personal Loan repaid " + repayAmount);
		
	}

	@Override
	public void foreClosure(boolean flag) {
		// TODO Auto-generated method stub
		System.err.println("There shall by 2% on Foreclosure");
		
	}
	

}
