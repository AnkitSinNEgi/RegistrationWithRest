package com.Registration.service;

import java.util.List;

import com.Registration.model.Employee;


public interface EmployeeServiceInt {

    List<Employee> getAllEmployees();
	
	Employee addEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp);
	
	
	
}
