package com.joker.register.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode


public class RegisterDTO {


	private String name;
	private String email;
	private long phoneNumber;
	private String password;
	private String cnfPassword;
	
	
	private String add;
	private String street;
	private String city;
	private int pincode;

	
	
}
