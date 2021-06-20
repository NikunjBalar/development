package com.xworkz.mediport.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "registration_table")
public class RegistrationEntity implements Serializable {

	@Id
	@GenericGenerator(name = "incr", strategy = "increment")
	@GeneratedValue(generator = "incr")
	@Column(name="e_eid")
	private int eid;
	@Column(name = "e_employeeid")
	private String employeeid;
	@Column(name = "e_email")
	private String email;
	@Column(name = "e_password")
	private String password;
	private String cpassword;

	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "RegistrationEntity [eid=" + eid + ", employeeid=" + employeeid + ", email=" + email + ", password="
				+ password + ", cpassword=" + cpassword + "]";
	}
	
	
}
