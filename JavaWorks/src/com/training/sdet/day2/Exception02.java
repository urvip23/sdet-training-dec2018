package com.training.sdet.day2;

public class Exception02 {
	
	public static void checkName(String custName) throws NameTooShortException{ //This is required for custom/checked exceptions
		if(custName.length() < 6){
			throw new NameTooShortException("Sorry name too short");
		}
	}
	
	public static void checkCreditScore(String custName, int creditScore) throws Exception{
		try {
		
		checkName(custName);
		
		if(creditScore < 400) {
			throw new RuntimeException("Sorry Credit Score is too low " + custName);
		}else if (creditScore >= 400 && creditScore < 700) {
			throw new RuntimeException("Need Background Verification " + custName);
		}else {
			System.out.println("You are good to go!! " + custName);
		}
		} catch(NameTooShortException ntse) {
			throw new Exception("Sorry did not process since name problem", ntse);
	
	  }
		
	}
	public static void main(String[] args) {
		try {
			checkCreditScore("John", 750);
		}catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Print other business logic..");
		
	}

}
