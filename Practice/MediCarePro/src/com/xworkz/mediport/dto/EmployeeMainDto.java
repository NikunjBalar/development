package com.xworkz.mediport.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="emp_details")

public class EmployeeMainDto{
	
	@Id
	@GenericGenerator(name = "incr",strategy = "increment")
	@GeneratedValue(generator = "incr")
	private int id;
	
	@Column(name = "emp_id")
	private String employeeid;
	@Column(name = "emp_firstname")
	private String firstname;
	@Column(name = "emp_lastname")
	private String lastname;
	@Column(name = "emp_email")
	private String email;

	@Column(name = "emp_bloodgroup")
	private char bloodgroup;

	
	public EmployeeMainDto() {
		System.out.println("created.... \t"+this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public char getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(char bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	@Override
	public String toString() {
		return "EmployeeMainDto [id=" + id + ", employeeid=" + employeeid + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", bloodgroup=" + bloodgroup + "]";
	}	
}
