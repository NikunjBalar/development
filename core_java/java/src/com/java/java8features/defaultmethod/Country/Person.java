package com.java.java8features.defaultmethod.Country;

public class Person implements Country{
	@Override
	public void citizenship() {
		Country.super.citizenship();
	}
	public void grtPopulation() {
		Country.population();
	}
}
