package com.pinkroccade.assignment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToOne
	private Employee partner;

	public Employee() {
		
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getPartner() {
		return partner;
	}

	public void setPartner(Employee partner) {
		this.partner = partner;
	}
}

