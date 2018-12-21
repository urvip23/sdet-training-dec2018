package com.training.sdet.day1;

public class Customer extends Person{
	private int custId;
	private String custName;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]" + super.toString();
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.setCustId(2101);
		c1.setCustName("Richard");
		c1.setPersonId(501);
		c1.setPersonName("Rick");
		
		System.out.println(c1);
	}
	
}
