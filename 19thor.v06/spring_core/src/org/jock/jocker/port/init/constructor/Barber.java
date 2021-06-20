package org.jock.jocker.port.init.constructor;

public class Barber {

	private String name;
	private int experiance;
	public Barber(String name,int experiance) {
		System.out.println("creating constructor"+this.getClass().getSimpleName());
		this.name=name;
		this.experiance=experiance;
	}
	
	public void hairDesigne() {
		System.out.println();
	}
}
