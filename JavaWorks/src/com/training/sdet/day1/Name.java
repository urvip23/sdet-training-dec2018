package com.training.sdet.day1;

public class Name {

		//Java Bean class
		//has -a relationship - Horizontal relation
		private String firstName;
		private String lastName;
		
		//Getter and Setters
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String toString() {
			return this.firstName +" " + this.lastName;
			
		}
		
}
