package com.xworkz.nik.Village.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="village_table")
public class VillageDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="village",strategy="increment")
	@GeneratedValue(generator="village")
	@Column(name="v_Id")
	private int id;
	@Column(name="v_Name")	
	private String name;
	@Column(name="v_Pin_Code")
	private int pincode;
	@Column(name="v_Population")
	private int population;
	@Column(name="v_Famouse_For")
	private String famousFor;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}


	
	public VillageDTO(){
		System.out.println("Creating default cunsructor");
	}
	
}
