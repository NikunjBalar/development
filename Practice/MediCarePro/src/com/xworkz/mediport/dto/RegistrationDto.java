package com.xworkz.mediport.dto;

public class RegistrationDto {

	private int eid;
	private String employeeid;
	private String email;
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
		return "EmployeeDto [eid=" + eid + ", employeeid=" + employeeid + ", email=" + email + ", password=" + password
				+ ", cpassword=" + cpassword + "]";
	}

}
