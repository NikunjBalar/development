package com.nik.Spring.manyobjectinspring.object;

public class Internet {

	private String provider;
	private Details details;

	public void setProvider(String provider) {
		System.out.println("invoked setProvider \t"+provider);
		this.provider = provider;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public void setDetails(Details details) {
		System.out.println("Invoked setDetails() \t"+details);
		this.details = details;
	}
	public void connect() {
		System.out.println("connected using provider");
		System.out.println("invoked connect()"); 
		if (details != null) {
			System.out.println("detailas of internate will found"+this.details.getType());
			this.details.info();
		}
	}
}
