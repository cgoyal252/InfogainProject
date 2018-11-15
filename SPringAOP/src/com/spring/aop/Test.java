package com.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext cc=new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeService e=(EmployeeService)cc.getBean("empservimpl");
		
		e.getEmployeeByName(11, "rsdfs");
		System.out.println();
		e.addEmployee();
	}

}
