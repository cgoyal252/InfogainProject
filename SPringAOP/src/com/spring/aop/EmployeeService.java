package com.spring.aop;

public class EmployeeService
{

	
	public void getEmployeeByName(int id,String name)
	{
		System.out.println("Inside getEmployeeByName");
		System.out.println("Eid " +id +" Ename: "+name);
	}
	
	
	
	public void addEmployee()
	{
		System.out.println("Inside addd method........");
	}
	
	
}
