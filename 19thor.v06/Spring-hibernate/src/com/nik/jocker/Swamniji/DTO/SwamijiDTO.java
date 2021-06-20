package com.nik.jocker.Swamniji.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="swamiji_info")
public class SwamijiDTO implements Serializable{
	
	@Id
	@Column(name="S_ID")
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	private Integer id;
	@Column(name="S_NAME")
	private String name;
	@Column(name="S_ASHRAMA")
	private String ashrama;
	@Column(name="S_MERRID")
	private Boolean merrid;
	
	public SwamijiDTO() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAshrama() {
		return ashrama;
	}

	public void setAshrama(String ashrama) {
		this.ashrama = ashrama;
	}

	public Boolean getMerrid() {
		return merrid;
	}

	public void setMerrid(Boolean merrid) {
		this.merrid = merrid;
	}

	@Override
	public String toString() {
		return "SwamijiDTO [id=" + id + ", name=" + name + ", ashrama=" + ashrama + ", merrid=" + merrid + "]";
	}

	public SwamijiDTO(String name, String ashrama, Boolean merrid) {
		super();
		this.name = name;
		this.ashrama = ashrama;
		this.merrid = merrid;
	}
	
	
	
	
}
