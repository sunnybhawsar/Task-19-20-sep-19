package com.wp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.dao.EmployeeDAO;
import com.wp.models.Employee;

@Service
public class Services implements ServicesInterface{
	
	@Autowired
	private EmployeeDAO employeeDAO;

								// Add Employee

	public String addEmployee(Employee employee)
	{
		
		String response = employeeDAO.addEmployee(employee);
		
		return response;
	}
	
								// Search Employee
	
	public Employee searchEmployee(int code)
	{		
		
		Employee emp = employeeDAO.getEmployeeById(code);
		
		return emp;
	}
	
								// View All Employees
	
	public List<Employee> viewAllEmployees()
	{		
		
		List <Employee> employees = employeeDAO.getAllEmployees();
		
		return employees;
	}
	
								// Update employee
	
	public String updateEmployee(Employee employee)
	{
		
		String response = employeeDAO.updateEmployee(employee);
				
		return response;
	}
	
								// Delete Employee
	
	public Employee deleteEmployee(int code)
	{
		Employee employee = employeeDAO.removeEmployee(code);
		
		return employee;
	}
	
}
