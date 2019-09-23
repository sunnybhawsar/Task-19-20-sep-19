package com.wp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wp.models.Employee;
import com.wp.services.ServicesInterface;

@Controller
public class EmployeeController {

	@Autowired
	private ServicesInterface services;

							// Add Employee

	@RequestMapping("AddController")
	public ModelAndView AddEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors())
		{
			ModelAndView modelAndView = new ModelAndView("AddEmployee");
			return modelAndView;
		}
		
		else
		{
			String response = services.addEmployee(employee);
	
			if (response.equals("Success")) 
			{
				ModelAndView modelAndView = new ModelAndView("EmployeeAdded");
				return modelAndView;
			} 
			else
			{
				ModelAndView modelAndView = new ModelAndView("Error");
				return modelAndView;
			}
		}
	}

							// Search Employee

	@RequestMapping("SearchController")
	public ModelAndView SearchEmployee(@RequestParam("eno") int code) {
		Employee emp = services.searchEmployee(code);

		if (emp != null) {
			ModelAndView modelAndView = new ModelAndView("EmployeeDetails");
			modelAndView.addObject("info", emp);
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("Error");
			return modelAndView;
		}
	}

							// View All Employee

	@RequestMapping("viewAllEmployeeController")
	public ModelAndView ViewAllEmployees() {

		List<Employee> employees = services.viewAllEmployees();

//System.out.println(employees);

		if (employees != null) {
			ModelAndView modelAndView = new ModelAndView("ViewAllEmployees");
			modelAndView.addObject("employeeList", employees);
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("Error");
			return modelAndView;
		}
	}

							// Update Employee

	@RequestMapping("UpdateController")
	public ModelAndView UpdateEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors())
		{
			bindingResult.addError(new ObjectError("employee.eno", "digits only"));
			ModelAndView modelAndView = new ModelAndView("UpdateEmployee");
			return modelAndView;
		}
		
		else
		{
			String response = services.updateEmployee(employee);
	
			System.out.println(response);
	
			if (response.equals("Success")) {
				ModelAndView modelAndView = new ModelAndView("EmployeeUpdated");
				return modelAndView;
			} 
			else 
			{
				ModelAndView modelAndView = new ModelAndView("Error");
				return modelAndView;
			}
		}
	}

							// Delete Employee

	@RequestMapping("DeleteController")
	public ModelAndView DeleteEmployee(@RequestParam("eno") int code) {
		Employee emp = services.deleteEmployee(code);

		if (emp != null) {

			ModelAndView modelAndView = new ModelAndView("EmployeeDeleted");
			modelAndView.addObject("info",emp);
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("Error");
			return modelAndView;
		}
	}
	
	
	@RequestMapping("DeleteController2")
	public ModelAndView DeleteEmployee2(@RequestParam("eno") int code) {
		Employee emp = services.deleteEmployee(code);

		if (emp != null) {

			ModelAndView modelAndView = new ModelAndView("redirect:viewAllEmployeeController");
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("Error");
			return modelAndView;
		}
	}

}
