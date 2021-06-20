package com.nik.Spring.manyobjectinspring.object;

public class SocialNetwork {

	private String name;
	private boolean working;
	private Internet internet;

	public SocialNetwork(String name, boolean working) {
		System.out.println("created \t" + this.getClass().getSimpleName());
		System.out.println("name \t" + name + " Is working \t" + working);
		this.name = name;
		this.working = working;
	}

	public void setInternet(Internet internet) {
		System.out.println("Invoked setInternet() \t"+internet);
		this.internet = internet;
	}
	
	public void load() {
		System.out.println("invoked load()");
		System.out.println("loading data");
		if (internet != null) {
			System.out.println("Internet will found,connecting with the internet"+this.internet.getProvider());
			this.internet.connect();
		}
	}

}