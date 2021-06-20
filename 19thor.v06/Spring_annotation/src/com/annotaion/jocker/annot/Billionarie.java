package com.annotaion.jocker.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Billionarie {
	
	private String name;
	private int welthe;
	@Value("10")
	private int noOfProperty;
	
	@Autowired
	public Billionarie(@Value("rakesh")String name) {
		System.out.println("created constructor "+name);
		this.name=name;
	}
	@Autowired
	public void setWelthe(int welthe) {
		this.welthe = welthe;
	}
	
	public int getNoOfProperty() {
		return noOfProperty;
	}
}
