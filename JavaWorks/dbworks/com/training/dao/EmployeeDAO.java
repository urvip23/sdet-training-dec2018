package com.training.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.connection.GetDBConnection;
import com.training.entity.Employee;
import com.training.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO{

	@Override
	public boolean insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		//arrays - 0
		// iterators - -1
		//positional parameters -1
		String sql = "insert into employee values(?,?,?,?)";
		
		GetDBConnection gc = new GetDBConnection();
		try {
			gc.ps = GetDBConnection.getMySqlConnection().
					prepareStatement(sql);
			
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2,  emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			gc.ps.setString(4,  emp.getEmpEmail());
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		String sql = "Delete from employee where empid =?";
		GetDBConnection gc = new GetDBConnection();
		
		try {
			gc.ps = GetDBConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(1, empId);
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateEmployee(int empId, double newSalary) {
		
		
		String sql = "update employee set empsal=? where empid =?";
		GetDBConnection gc = new GetDBConnection();
		
		try {
			gc.ps = GetDBConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setDouble(1, newSalary);
			gc.ps.setInt(2, empId);
			
			return gc.ps.executeUpdate()>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
				
	}

	@Override
	public Employee getEmployee(int empId) {
		
		String sql = "select empid, empname,empsal, empemail "
				+ "from employee where empid=?";
		//can also write String sql = "select *";
		
		GetDBConnection gc = new GetDBConnection();
		try {
			gc.ps1 = GetDBConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps1.setInt(1, empId);

			gc.rs = gc.ps1.executeQuery(); 

			if(gc.rs.next()){
				Employee e = new Employee();
				e.setEmpId(gc.rs.getInt(1));
				e.setEmpName(gc.rs.getString(2));
				e.setEmpSal(gc.rs.getDouble(3));
				e.setEmpEmail(gc.rs.getString(4));
				
				return e;
			}
			
			return null;
		} catch (SQLException e) {
 			e.printStackTrace();
		} finally {
			try {
				gc.ps1.close();
				gc.rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		//This is the sql that queries the DB
		String sql = "select empid, empname,empsal, empemail "
				+ "from employee";
		
		GetDBConnection gc = new GetDBConnection();
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			gc.ps = GetDBConnection.getMySqlConnection().prepareStatement(sql);
			
			// there might be more than 1 record
			gc.rs = gc.ps.executeQuery();
			
			while(gc.rs.next()) {
				
				Employee e = new Employee();
				e.setEmpId(gc.rs.getInt(1));
				e.setEmpName(gc.rs.getString(2));
				e.setEmpSal(gc.rs.getDouble(3));
				e.setEmpEmail(gc.rs.getString(4));
				
				empList.add(e);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

		return empList;
	}
	
	

}
