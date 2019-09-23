package com.wp.services;

import java.util.List;

import com.wp.models.Employee;

public interface ServicesInterface {
	
	public String addEmployee(Employee employee);
	public Employee searchEmployee(int code);
	public List<Employee> viewAllEmployees();
	public String updateEmployee(Employee emp);
	public Employee deleteEmployee(int code);
}
