package com.infogain.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infogain.model.Employee;

public interface EmployeeService {

	
	public void addEmployee(Employee emp);
	
	public List<Employee> listEmployees();
	
}
