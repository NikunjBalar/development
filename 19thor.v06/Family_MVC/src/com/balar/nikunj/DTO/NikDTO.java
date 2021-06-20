package com.balar.nikunj.DTO;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class NikDTO implements Serializable{

	private String familyName;
	private String memberName;
	private String occupation;
	private String place;
	private char gender;
	
	public NikDTO() {
		System.out.println("created \t"+this.getClass().getTypeName());
	}
	
}
