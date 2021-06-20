package org.jock.jocker.port.init.constructor;

public class Trimmer {

	private String brand;
	private String weight;
	private int price;
	
	public Trimmer(String brand,String weight) {
		System.out.println("creating constructor1 \t"+this.getClass().getSimpleName());	
		this.brand=brand;
		this.weight=weight;
		System.out.println("brand \t"+brand+"\t weight \t"+weight);
	}
	
	public Trimmer(String brand,int price) {
		System.out.println("creating constructor2 \t"+this.getClass().getSimpleName());
		this.brand=brand;
		this.price=price;
		System.out.println("brand \t"+brand+"\t price \t"+price);
	}
	
}
