package com.training.businesslogic.test;

public class MyBusinessLogic {
	
	public int insertRecord(int empId, String empName) {
		System.out.println("Inserting EmpId " + 
				empId +", Name " + 
				empName);
		
		// simulating 
		// 1 s delay 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return 1; 
	}

	
	public String sayHello(String name){
		if (1==1) {
		throw new RuntimeException("Hey I am custom exception!");
		}
		return "Hello " + name;
	}
	
	

}
