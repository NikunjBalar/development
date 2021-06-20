package org.jock.jocker.port.init.Setter;

public class Stethoscope {
	
	private String brand;
	
	public Stethoscope() {
		System.out.println("created \t "+this.getClass().getSimpleName());
	}
	
	public void setBrand(String brand) {
		System.out.println("invoked setter \t"+brand);
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
}
