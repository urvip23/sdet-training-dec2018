package com.training.sdet.day1;

public class Person {
	private int personId;
	private String personName;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	@Override //Annotations at compile time not run time
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	
	

}
