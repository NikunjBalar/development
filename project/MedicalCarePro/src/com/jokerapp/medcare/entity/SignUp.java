package com.jokerapp.medcare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "signup_details")

@Getter
@Setter
@EqualsAndHashCode
public class SignUp {

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "signup", strategy = "increment")
	@GeneratedValue(generator = "signup")
	private int id;
	
	@Column(name = "employeeId")
	private String employeeId;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Transient
	private String cPassword;

	// Logger logger = Logger.getLogger(MedicalCare.class.getName());

	public SignUp() {
		// logger.info(" created signup entity");
	}

	@Override
	public String toString() {
		return "SignUp [id=" + id + ", employId=" + employeeId + ", email=" + email + ", password=" + password
				+ ", cPassword=" + cPassword + "]";
	}
}
