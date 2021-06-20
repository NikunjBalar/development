package com.jocker.relation.OneToOne;

public class Universe {
	private String name;
	private int noOfGalaxys;
	private char size;
	
	private SolarSystem solarSystem;
	
	public Universe() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	
	public SolarSystem getSolarSystem() {
		return solarSystem;
	}

	public void setSolarSystem(SolarSystem solarSystem) {
		this.solarSystem = solarSystem;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfGalaxys() {
		return noOfGalaxys;
	}

	public void setNoOfGalaxys(int noOfGalaxys) {
		this.noOfGalaxys = noOfGalaxys;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
}
