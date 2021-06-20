package com.java.encapsulation;

public class EncapsulationDemo{
	public static void main(String[] args) {
		System.out.println("main method started..");
		
		Product1 p=new Product1();
		p.setBrandName("nik");
		p.setProduct("bluetooth");
		
		
		
		System.out.println(p.getBrandName());
		
		System.out.println("main method ended..");
	}
}
class Product1 {
	private String brandName;
	private String product;
	private String type;
	private double price;
	private long barcode;
	
	public Product1() {
		System.out.println("product dc...");
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName() {
		return this.brandName;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProduct() {
		return this.product;
	}

}