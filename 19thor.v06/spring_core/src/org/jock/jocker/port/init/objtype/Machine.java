package org.jock.jocker.port.init.objtype;

public class Machine {
	private String purpose;
	
	public void setPurpose(String purpose) {
		System.out.println("invoked setPurpose" +purpose);
		this.purpose=purpose;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void polishingInMachine() {
		System.out.println("invoked polishingInMachine()");
	}
}
