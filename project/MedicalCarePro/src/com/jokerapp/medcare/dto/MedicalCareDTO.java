package com.jokerapp.medcare.dto;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode

public class MedicalCareDTO implements Serializable {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String bloodGroup;
	private String phoneNumber;
	private String password;
	private String cPassword;

	// Logger logger = Logger.getLogger(MedicalCare.class.getName());

	public MedicalCareDTO() {
		System.out.println("created " + this.getClass().getSimpleName());
		// logger.info("created \t" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "MedicalCareDTO [employId=" + employeeId + ", email=" + email + ", password=" + password + ", cPassword="
				+ cPassword + "]";
	}
}
