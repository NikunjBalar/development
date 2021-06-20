package org.jock.jocker.port.init.Setter;

public class Rainbow {

	private String color;
	private float intensity;
	private boolean there;
	
	public Rainbow(String color) {
		System.out.println("craeated \t"+this.getClass().getSimpleName());
		System.out.println("color \t"+color);
		this.color=color;
	}
	
	public void setIntensity(float intensity) {
		System.out.println("invoked intensity \t"+intensity);
		this.intensity = intensity;
	}
	
	public float getIntensity() {
		
		return intensity;
	}
	
	public void setThere(boolean there) {
		System.out.println("invoked there \t"+there);
		this.there = there;
	}
	
	public boolean isThere() {
		return there;
	}
}
