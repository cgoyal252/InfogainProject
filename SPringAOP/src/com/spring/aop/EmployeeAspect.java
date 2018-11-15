package com.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect
{
	@Before("execution(* com.spring.aop.EmployeeService.getEmployeeByName(..))")
	public void beforeAdvice(JoinPoint j)
	{
		System.out.println("Before execution of jp method ");
		System.out.println("Name of JoinPOint "+j.getSignature().getName());
		System.out.println("aRGS :"+Arrays.toString(j.getArgs()));
	}
}
