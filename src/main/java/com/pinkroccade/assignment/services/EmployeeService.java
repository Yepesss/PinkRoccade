package com.pinkroccade.assignment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinkroccade.assignment.entities.Employee;
import com.pinkroccade.assignment.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	   @Autowired
	   private EmployeeRepository employeeRepository;
	   
	   public void saveEmployee(Employee employee) {
		   employeeRepository.save(employee);
	   }

}
