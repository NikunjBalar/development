package com.nikunj.nikapp.Demo;

public class Leptop {
	private String brandName;
	private String modelName;
	double price;

	public Leptop() {
		System.out.println("default constructor");
		System.out.println("mojma revanu aavu kai karvanu na hoi");
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
