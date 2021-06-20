package org.jock.jocker.port.init.Dramaa;

public class MakeupKit {
	private String aplication;
	private String type;
	
	public MakeupKit() {
		
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	
	public void setAplication(String aplication) {
		System.out.println("setAplication chalu che \t"+aplication);
		this.aplication = aplication;
	}
	
	public void setType(String type) {
		System.out.println("setType chalu che \t"+type);
		this.type = type;
	}
}
