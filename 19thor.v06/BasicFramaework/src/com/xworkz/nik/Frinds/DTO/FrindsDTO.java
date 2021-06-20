package com.xworkz.nik.Frinds.DTO;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="friends_table")
public class FrindsDTO implements Serializable{
	
	// defining properties
	//adding anotation
	@Id
	@GenericGenerator(name="Friends",strategy="increment")
	@GeneratedValue(generator="Friends")
	@Column(name="f_Num")
	private int num;
	@Column(name="f_Name")
	private String fullName;
	@Column(name="f_MobileNum")
	private long number;
	@Column(name="f_Email")
	private String email;
	@Column(name="f_state")
	private String state;
	
	//  creating getter and setter method for all the properties
/*	public int getNum() {
		return num;
	}
	public void setNum(int num) {
	}*/
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public FrindsDTO() {
		System.out.println("creating default constructer");
	}
}
