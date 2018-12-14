package com.training.sdet.day1;

public class InheritPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
			
		e.setPersonId(101);
		e.setPersonName("Urvi");
		e.setEmpSalary(10000);
		e.setProjectName("MF Automation Testing");
		
		System.out.println(e); 
			
		// Polymorphism
		Person p = new Employee();
		p.setPersonId(601);
		p.setPersonName("Sam");
		((Employee)p).setEmpSalary(20000);
		((Employee)p).setProjectName("SF Automation Testing");
		
		System.out.println();
		System.out.println(p);
		
		//p = new Customer();
		
		//Type Cast Exception
		//System.out.println(p);
		//System.out.println(((Employee)p).getEmpSalary());
				
		

	}

}
