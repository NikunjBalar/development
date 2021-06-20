package com.xworkz.nik.Transporter.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Transporter_info")
public class TransporterDTO implements Serializable {
	
	@Id
	@GenericGenerator(name="anything",strategy="increment")
	@GeneratedValue(generator="anything")
	@Column(name="t_Id")
	private int id;
	@Column(name="t_Name")
	private String name;
	@Column(name="t_stste")
	private String state;
	@Column(name="t_email")
	private String email;
	@Column(name="t_PhoneNum")
	private long phoneno;

	public TransporterDTO() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

/*	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String country) {
		this.state = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "TransporterDTO [id=" + id + ", name=" + name + ", state=" + state + ", email=" + email
				+ ", phoneno=" + phoneno + "]";
	}

}
