package com.infogain.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infogain.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addEmployee(Employee emp)
	{
		Session s=sessionFactory.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(emp);
		tx.commit();
		s.close();
	}
	
	public List<Employee> listEmployees()
	{
		Session s=sessionFactory.openSession();
		List<Employee> e=(List<Employee>)s.createCriteria(Employee.class).list();
		
		return e;
	}
	
	
}
