package com.jocker.relation.OneToOne;

public class SolarSystem {
	private int noOfPlanets;
	private String name;
	private int ageInMilions;
	
	public SolarSystem() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	
	@Override
	public String toString() {
		return "SolarSystem [noOfPlanets=" + noOfPlanets + ", name=" + name 
				+ ", ageInMilions=" + ageInMilions + "]";
	}

	public int getNoOfPlanets() {
		return noOfPlanets;
	}
	public void setNoOfPlanets(int noOfPlanets) {
		this.noOfPlanets = noOfPlanets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAgeInMilions() {
		return ageInMilions;
	}
	public void setAgeInMilions(int ageInMilions) {
		this.ageInMilions = ageInMilions;
	}
	
	
}
