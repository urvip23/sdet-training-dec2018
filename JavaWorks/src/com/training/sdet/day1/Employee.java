package com.training.sdet.day1;

public class Employee extends Person {
	private double empSalary;
	private String projectName;
	
	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Override
	public String toString() {
		return "Employee [empSalary=" + empSalary + ", projectName=" + projectName + "]" + super.toString();
	}

}
