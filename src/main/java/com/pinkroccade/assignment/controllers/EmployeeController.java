package com.pinkroccade.assignment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pinkroccade.assignment.entities.Employee;
import com.pinkroccade.assignment.repository.EmployeeRepository;
import com.pinkroccade.assignment.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;	
	@Autowired
	private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
    	
    	//Check if the name input is empty and return without creating.
    	if (employee.getName() == null || "".equals(employee.getName().trim())) {
    		return "Name of employee may not be empty.";
    	}
    	
    	//Create the employee
    	Employee newEmployee = new Employee(employee.getName());
    	
    	//Save the employee
    	return employeeService.saveEmployee(newEmployee);
    }
    
    @PostMapping("/deleteEmployee")
    public String deleteEmployee(@RequestBody Employee employee) {
    	//delete the employee
    	return employeeService.deleteEmployee(employee);
    }
    
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {
    	//Get a list of all the employees that exists in the database
    	List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
    	
    	//Return that list
    	return employeeList;
    }
}
