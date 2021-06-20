package com.java.ObjectClass;

public class TwoStringDemo {
	public static void main(String[] args) {
		Mobile m1=new Mobile("VIVO","VIVO1716",22000.989,982756872l);
		Mobile m2=new Mobile("samsung","galexy",1000.8898,878775825l);
			System.out.println("Mobile 1 :"+m1);
			System.out.println("--------------------------------------------------------");
			System.out.println("mobile 2 :"+m2);
	}
}

class Mobile{
	String brandName;
	String model;
	double price;
	long IMEI;
	
	Mobile(String brandName, String model,double price,long IMEI){
		this.brandName=brandName;
		this.model=model;
		this.price=price;
		this.IMEI=IMEI;
	}

	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ",\n model=" + model + ",\n price=" + price + ", IMEI=" + IMEI + "]";
	}
}