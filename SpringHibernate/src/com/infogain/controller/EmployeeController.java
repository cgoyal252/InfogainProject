package com.infogain.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infogain.model.Employee;
import com.infogain.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;


	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String welcome()
	{
		return "index";
	}



	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView addEmployee()
	{

		return new ModelAndView("addEmployee","command",new Employee());
	}



	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveEmployee(Employee emp)
	{

		employeeService.addEmployee(emp);
		return "redirect:/employees";
	}

	@RequestMapping("/employees")
	public ModelAndView getEmployees()
	{
		Map<String,Object> model=new HashMap<String,Object>();

		model.put("employees", employeeService.listEmployees());

		return new ModelAndView("employeesList",model);
	}
}