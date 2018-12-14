package com.training.client;

import com.training.dao.EmployeeDAO;
import com.training.entity.Employee;
import com.training.standards.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(105);
		e.setEmpName("John");
		e.setEmpSal(1122);
		e.setEmpEmail("john89@gmail.com");
		
		IEmployeeDAO dao = new EmployeeDAO();
		
		//boolean insertFlag = dao.insertEmployee(e);
		
		// <condition> ? "<True>":"<False>"
		//System.out.println(insertFlag?"Record Inserted" : "Sorry Record Not Inserted");
		//System.out.println(dao.deleteEmployee(105));
		//System.out.println(dao.updateEmployee(101, 5000.65));
		
		
		//System.out.println(dao.getEmployee(102));
		System.out.println("------------------------------------List of Employees---------------------------------");
		//Simpler way to print
		dao.getAllEmps().forEach(
				System.out :: println);
				
	}

}
