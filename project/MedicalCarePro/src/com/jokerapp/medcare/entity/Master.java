package com.jokerapp.medcare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Table(name = "emp_details")

@Getter
@EqualsAndHashCode

public class Master {

	@Column(name = "emp_id")
	private String employeeId;
	@Column(name = "emp_firstname")
	private String firstName;
	@Column(name = "emp_lastname")
	private String lastName;
	@Column(name = "emp_email")
	private String email;
	@Column(name = "emp_bloodgroup")
	private String bloodGroup;
	@Column(name = "emp_phonenumber")
	private String phoneNumber;

	public Master() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Master [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", bloodGroup=" + bloodGroup + ", phoneNumber=" + phoneNumber + "]";
	}
}
