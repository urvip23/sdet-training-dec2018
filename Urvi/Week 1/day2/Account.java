package com.training.sdet.day2;

public class Account implements Comparable<Account>{
	private int accountId; //Kept in heap
	private String name; //Kept in heap
	private double balance; //Kept in heap
	
	private static int count=100; //Kept in a Stack and can be accessible globally
	
	public Account(String name, double balance) {
		super();
		this.accountId = count++;
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getName() {
		return name;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
		//this.getName().compareTo(this.getName())  Can I do this?
	}

	@Override
	public int compareTo(Account o) {
		//return  o.getAccountId()- this.getAccountId(); //This does the sort internally 
		return this.getName().compareTo(o.getName()); //This sorts by Name - Uses String compareTo
	}

}
