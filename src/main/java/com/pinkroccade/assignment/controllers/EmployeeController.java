package com.pinkroccade.assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pinkroccade.assignment.entities.Employee;
import com.pinkroccade.assignment.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

    @PostMapping("/save")
    public void saveEmployee(@RequestBody String name) {
    	Employee employee = new Employee(name);
    	employeeService.saveEmployee(employee);
    }
}
