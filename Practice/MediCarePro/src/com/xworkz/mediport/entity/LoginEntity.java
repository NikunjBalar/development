package com.xworkz.mediport.entity;

import java.io.Serializable;


public class LoginEntity implements Serializable {
	private String empid;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	private String email;
	private String password;
	
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
	@Override
	public String toString() {
		return "LoginEntity [emailid=" + empid + ", email=" + email + ", password=" + password + "]";
	}
	

}
