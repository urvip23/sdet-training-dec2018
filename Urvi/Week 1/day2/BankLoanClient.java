package com.training.sdet.day2;

public class BankLoanClient {
	public static void main(String[] args) {
		BankLoan bnkln = new Personal();
		bnkln.foreClosure(true);
		bnkln.loanAmount(5000);
		bnkln.repay(500);
		System.out.println();
		
		bnkln = new Mortgage();
		bnkln.foreClosure(false);
		bnkln.loanAmount(8000);
		bnkln.repay(1000);
		System.out.println();
		
	}

}
