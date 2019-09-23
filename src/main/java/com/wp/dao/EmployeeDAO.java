package com.wp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wp.models.Employee;

@Repository
public class EmployeeDAO implements EmployeeDAOinterface {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	Session session;
	Transaction transaction;
		
								// Add Employee
		
	public String addEmployee(Employee employee) {
		
		session = sessionFactory.openSession();
		
		transaction = session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		session.close();
		
		return "Success";
	}
	
	
								// Search by employee code

	public Employee getEmployeeById(int code) {
		
		session = sessionFactory.openSession();
		
		Employee emp = session.get(Employee.class,code);
		
		session.close();
		return emp;
	}
	
	
								// fetch all employees

	public List<Employee> getAllEmployees() {
		
		session = sessionFactory.openSession();
		
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Employee.class);
		
		@SuppressWarnings("unchecked")
		List <Employee> employees = criteria.list();
			
		session.close();
		
		return employees;
	}
	
	
								// update employee
	
	public String updateEmployee(Employee employee) {
		
		session = sessionFactory.openSession();
		
		transaction = session.beginTransaction();
		
		session.update(employee);
		
		transaction.commit();
		session.close();
		
		return "Success";
	}
	
	
								// delete employee
	

	public Employee removeEmployee(int code) {
		
		session = sessionFactory.openSession();
		
		transaction = session.beginTransaction();
		
		Employee employee = session.get(Employee.class,code);
		
		System.out.println("@@@@from dao : "+employee);
			
		if(employee!=null)
		session.delete(employee);
		
		transaction.commit();
		
		session.close();
		
		return employee;
	}

}
