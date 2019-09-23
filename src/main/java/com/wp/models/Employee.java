package com.wp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

@Entity
public class Employee {
	
	//@Size(min=1,max=10, message="*Required!")
	//@Pattern(regexp="[0-9]", message="*Only digits Allowed!")
	//@Digits(message="*Only digits!", integer=1, fraction=0)
	//@Pattern(regexp="(^$|[0-9]{1-10})")
	
	
	//@Digits(integer = 10,message = "skjuhdafgukiawshy",fraction = 0 )
	@Min(value=1, message="*Required!")
	@Id
	private int eno;
	
	
	@Size(min=2,max=30, message="*Required!")
	@Pattern(regexp="[a-zA-Z]", message="*Only alphabates allowed!")
	private String name;
	
	//@Size(min=1,max=10, message="*Required!")
	//@Pattern(regexp="[0-9]*", message="*Only digits Allowed!")
	@Min(value=1, message="*Required!")
	private int salary;
	
	// Constructors
	
	public Employee(int eno, String name, int salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	public Employee(int eno) {
		super();
		this.eno = eno;
	}
	public Employee() {
		super();
	}
	
	// Getters and Setters
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	// ToString method
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
