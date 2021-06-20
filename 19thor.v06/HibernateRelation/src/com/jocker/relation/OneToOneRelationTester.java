package com.jocker.relation;

import com.jocker.relation.OneToOne.SolarSystem;
import com.jocker.relation.OneToOne.Universe;

public class OneToOneRelationTester {
	public static void main(String[] args) {
		
		//step 1
		Universe universe=new Universe();
		universe.setName("jock");
		universe.setNoOfGalaxys(4);
		universe.setSize('l');

		//step 2
		SolarSystem solarSystem=new SolarSystem();
		solarSystem.setName("jockey way");
		solarSystem.setNoOfPlanets(1);
		solarSystem.setAgeInMilions(110);
		
		//step 3
		universe.setSolarSystem(solarSystem);
		SolarSystem refOfSolarSystem=universe.getSolarSystem();
		System.out.println(refOfSolarSystem.getName());
		System.out.println(refOfSolarSystem);
	}
}
