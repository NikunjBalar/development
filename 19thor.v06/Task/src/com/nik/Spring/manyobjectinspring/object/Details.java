package com.nik.Spring.manyobjectinspring.object;

public class Details {
	private int speed;
	private String type; 
	
	public Details(int speed) {
		System.out.println("created \t"+this.getClass().getSimpleName());
		System.out.println("Speed \t"+speed);
		this.speed=speed;
		
	}
	
	public void setType(String type) {
		System.out.println("invoked setType \t"+type);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void info(){
		System.out.println("Speed \t"+speed+"mbps\tType \t"+ type );
	}
	
}
