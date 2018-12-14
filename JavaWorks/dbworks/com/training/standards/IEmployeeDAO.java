package com.training.standards;

import java.util.List;

import com.training.entity.Employee;

public interface IEmployeeDAO {
	
	//CRUD operations
	
	public boolean insertEmployee(Employee emp);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(int empId, 
			double newSalary);
	public Employee getEmployee(int empId);
	public List<Employee> getAllEmps();
	

}
