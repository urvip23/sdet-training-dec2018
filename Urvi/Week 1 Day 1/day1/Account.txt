package com.training.sdet.day1;

// ctrl + shift + f
//This is a Java Bean class
public class Account {

	//gets injected by compiler when
	//compiling of this .java file
	
	public Account() {
	 super();
	}
	
	private int accId;
	private double accBalance;
	//private String accHolderName;
	private Name name;
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		if(accBalance < 0) {
			System.out.println("Sorry Balance too low");
			this.accBalance = 1000;
		}else {
			this.accBalance = accBalance;
		}
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accBalance=" + accBalance + ", name=" + name + "]";
	}
	
	//Ctrl + Forward Slash
//	public String toString(){
//		return this.accId +", " + this.accBalance +", " + this.name; 
//	}

	
	/*
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		if(accHolderName.length() < 6) {
			System.out.println("Sorry Name too small");
			this.accHolderName = "NO NAME";
		}else {
			this.accHolderName = accHolderName;
		}
	} */
	
	
	

}
	
	
	

	

