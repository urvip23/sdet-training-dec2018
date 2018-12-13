package com.project1.entity;

//Java Bean class
public class Account {
	private int acctId;
	private String acctNo;
	private double acctBal;
	private double avgBal;
	private double percent;
	
	//Default constructor
	public Account() {}

	//Parametric constructor
	public Account(int acctId, String acctNo, double acctBal, double avgBal, double percent) {
		super();
		this.acctId = acctId;
		this.acctNo = acctNo;
		this.acctBal = acctBal;
		this.avgBal = avgBal;
		this.percent = percent;
	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public double getAcctBal() {
		return acctBal;
	}

	public void setAcctBal(double acctBal) {
		this.acctBal = acctBal;
	}

	public double getAvgBal() {
		return avgBal;
	}

	public void setAvgBal(double avgBal) {
		this.avgBal = avgBal;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Account [acctId=" + acctId + ", acctNo=" + acctNo + ", acctBal=" + acctBal + ", avgBal=" + avgBal
				+ ", percent=" + percent + "]";
	};
	
}
