package com.training.sdet.day2;

//Interfaces are used to maintain standards as it shows the impact of any change to the interface
//across all the classes
//Eg. Remote Control, Alexa

public interface BankLoan {
	void loanAmount(int amount);
	void repay(int repayAmount);
	void foreClosure(boolean flag);
	

}
