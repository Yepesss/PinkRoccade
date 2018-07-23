package com.pinkroccade.assignment.repository;

import org.springframework.data.repository.Repository;

import com.pinkroccade.assignment.entities.Employee;

	
public interface EmployeeRepository extends Repository<Employee, Long> {

	public void save(Employee employee);
	
}


