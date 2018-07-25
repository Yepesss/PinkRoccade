package com.pinkroccade.assignment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinkroccade.assignment.entities.Employee;
import com.pinkroccade.assignment.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	   @Autowired
	   private EmployeeRepository employeeRepository;
	   
	   public String saveEmployee(Employee employee) {
		   employeeRepository.save(employee);
		   return "Employee is succesfully created."; 
	   }
	   
	   public String updateEmployee(Employee employee) {
		   return "Employee is succesfully updated.";
	   }
	   
	   public String deleteEmployee(Employee employee) {
		   employeeRepository.deleteById(employee.getId());
		   return "Employee is succesfully deleted."; 
	   }

}
