package com.infogain.dao;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.infogain.model.Employee;



public interface EmployeeDao {

	
	public void addEmployee(Employee emp);
	
	public List<Employee> listEmployees();
	
}
