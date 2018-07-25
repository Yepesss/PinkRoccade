package com.pinkroccade.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.pinkroccade.assignment.entities.Employee;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
}


