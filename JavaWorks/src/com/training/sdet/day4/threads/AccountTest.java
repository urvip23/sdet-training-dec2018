package com.training.sdet.day4.threads;

public class AccountTest implements Runnable {
	private Account account;
	private int amount;
	private Thread t;
	
	@Override
	public void run(){
		
		synchronized(account){
				account.withDraw(amount);
		}
	}
	
	public AccountTest(Account account, int amount, String custName) {
		//super();
		
		this.account = account;
		this.amount = amount;
		t = new Thread(this, custName);
		t.start();
		
	}

	public static void main(String[] args) {
		Account acc = new Account(1000);
		new AccountTest(acc, 500, "John");
		new AccountTest(acc, 750, "Raj");
		
//		ArrayList<String> arr;
//		Vector<String> vec;
		
		
		
	}
	
	
	

}
