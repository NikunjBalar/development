package org.jock.jocker.port.init.constructor;

public class Water {
	
	private float phLavel;
	
	public Water(float phLavel) {
		System.out.println("creating constructor"+this.getClass().getSimpleName());
		this.phLavel=phLavel;
		System.out.println();
	}
	
	public void flow(String location) {
		System.out.println("location \t"+location);
	}
}
