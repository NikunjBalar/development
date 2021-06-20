package com.joker.register.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="personal")

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class RegisterEntityPersonal{
	
	@Id
	@GenericGenerator(name="nik", strategy="increment")
	@GeneratedValue(generator="nik")
	@Column(name = "R_id")
	private int id;
	@Column(name = "R_name")
	private String name;
	@Column(name = "R_email")
	private String email;
	@Column(name = "R_phoneNumber")
	private long phoneNumber;
	@Column(name = "R_password")
	private String password;
	@Column(name = "R_cnfPassword")
	private String cnfPassword;
	@Column(name="R_add")
	private String add;
	
	public RegisterEntityPersonal() {
		
		System.out.println("created \t"+this.getClass().getTypeName());
	}
}
