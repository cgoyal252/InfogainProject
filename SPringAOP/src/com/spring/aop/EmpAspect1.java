package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class EmpAspect1 {

	
	
	@Before("execution(* com.spring.aop.EmployeeService.addEmployee() )")
	public void beforeadd()
	{
		System.out.println("Before 2....");
	}
	
	
}
