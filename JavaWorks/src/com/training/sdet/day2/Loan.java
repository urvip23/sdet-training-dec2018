package com.training.sdet.day2;

public abstract class Loan {
	private int loanId;
	private int loanAmount;
	//Try has-a relation with customer
	
	public Loan(int loanId, int loanAmount){
		this.loanId = loanId;
		this.loanAmount = loanAmount;
	}
	
	//Getting it from DB to get more than one and avoid hard-coding
	public String getName(){
		return "John";
	}
	
	public String getAddress(){
		return "13100 Worldgate Dr, Herndon, VA";
	}
	
	//<Access Specifier> <Access Modifier> <Return Type/void> method(args)
	// public private protected default
	// abstract final static synchronize
	public abstract double getROI();
	

}
