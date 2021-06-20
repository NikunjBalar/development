package com.jokerapp.medcare.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class SignIn {

	private String employeeId;
	private String email;
	private String password;
	
	public SignIn() {
		
	}

	@Override
	public String toString() {
		return "SignIn [employeeId=" + employeeId + ", email=" + email + ", password=" + password + "]";
	}

}
