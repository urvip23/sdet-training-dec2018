package com.training.sdet.day2;

public class Mortgage implements BankLoan{

	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Mortage Loan amount is " + amount);
		
	}

	@Override
	public void repay(int repayAmount) {
		// TODO Auto-generated method stub
		System.out.println("Mortgage Loan repay Amount is " + repayAmount);
		
	}

	@Override
	public void foreClosure(boolean flag) {
		// TODO Auto-generated method stub
		System.err.println("Mortgage foreclosed");
		
	}

}
