package com.wp.dao;

import java.util.List;

import com.wp.models.Employee;

public interface EmployeeDAOinterface {
	
	public String addEmployee(Employee employee);
	public Employee getEmployeeById(int code);
	public List<Employee> getAllEmployees();
	public String updateEmployee(Employee employee);
	public Employee removeEmployee(int code);
	
}
