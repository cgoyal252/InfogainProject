package com.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspect
{
//	@Before("execution(* com.spring.aop.EmployeeService.getEmployeeByName(..))")
	public void beforeAdvice(JoinPoint j)
	{
		System.out.println("Before execution of jp method ");
		System.out.println("Name of JoinPOint "+j.getSignature().getName());
		System.out.println("aRGS :"+Arrays.toString(j.getArgs()));
	}
	
	@Pointcut("execution(* *.*(..))")
	public void all()
	{
		
	}
	
	
	@Around("all()")
	public void logAround(ProceedingJoinPoint pj) throws Throwable
	{
		
		
		System.out.println("Before execution of join point");
		
		pj.proceed();
		
		System.out.println("After execution of joinpoint.....");
		
		
		
	}
}
