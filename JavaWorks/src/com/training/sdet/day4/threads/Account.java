package com.training.sdet.day4.threads;

public class Account {
	
	private int balance;
	
	//this is to the got from DB
	public Account(int balance){
		this.balance = balance;
	}
	
	public void withDraw(int amount){
		if(amount < balance){
			System.out.println("Amount withdraw of " +
						amount + " by " +
						Thread.currentThread().getName());
				
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		balance = balance - amount;
		
		System.out.println("Remaining balance after " +
							"withdraw " + balance);
			
	} else {
			System.out.println("Sorry Mr/Mrs/Ms " +
							Thread.currentThread().getName() + 
							" you don't have sufficient balance."+ balance);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
