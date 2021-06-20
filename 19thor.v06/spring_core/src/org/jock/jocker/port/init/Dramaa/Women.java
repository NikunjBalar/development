package org.jock.jocker.port.init.Dramaa;

public class Women {

	private String event;
	private double budget;
	private MakeupKit kit;
	
	public Women( String event,double budget) {
		System.out.println("crated \t"+this.getClass().getSimpleName());
		this.event=event;
		this.budget=budget;
	}
	
	public void setKit(MakeupKit kit) {
		System.out.println("setKit chalu che \t "+kit);
		this.kit = kit;
	}
	
	
	
}
