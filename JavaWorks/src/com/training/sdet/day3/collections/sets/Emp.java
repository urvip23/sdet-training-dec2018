package com.training.sdet.day3.collections.sets;

public class Emp implements Comparable<Emp>{
	private int empId;
	private String empName;
	private double empSal;
	
	public Emp(){}
	
	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode(); //create new hashCode
		return this.empName.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Emp emp = (Emp) obj;
		//if(
		return
		   this.empId == emp.empId && 
		   this.empName.equals(emp.getEmpName()) && 
		   this.empSal == emp.empSal;
//				) {
//				return true;
//		} else {
//			return false;
//		}
//	   }
	}
	
	//Sorts the empId for TreeSet to work
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.empId - o.empId;
	}
	
	
			
	
	
	
	

}
