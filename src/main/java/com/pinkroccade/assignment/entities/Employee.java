package com.pinkroccade.assignment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
    @Id 
    @GeneratedValue
    private int id;
   
    private String name;

    @OneToOne
    private Employee partner;

    public Employee(String name) {
	   this.name = name;
    }

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public Employee getPartner() {
		return partner;
	}

	public void setPartner(Employee partner) {
		this.partner = partner;
	}
	
	

}