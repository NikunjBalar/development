package com.xworkz.nik.Stadium.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stadium_table")
public class StadiumDTO implements Serializable{
	
	@Id
	@Column(name="s_Id")
	private int sid;
	@Column(name="s_Capacity")
	private int capacity;
	@Column(name="s_EntryFee")
	private double entryFee;
	@Column(name="s_NoOfEntry")
	private int noOfEntry;
	@Column(name="s_Parking")
	private boolean parking;
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public StadiumDTO() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "StadiumDTO [capacity=" + capacity + ", entryFee=" + entryFee + ", noOfEntry=" + noOfEntry + ", parking="
				+ parking + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public int getNoOfEntry() {
		return noOfEntry;
	}

	public void setNoOfEntry(int noOfEntry) {
		this.noOfEntry = noOfEntry;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}
}
