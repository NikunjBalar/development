package com.java.ObjectClass;

public class SallowCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
	Car c=new Car();
	Car c1=(Car) c.clone();
	c.brandName="Audi";
	System.out.println(" c : "+c.brandName);
	System.out.println(" c1 : "+c1.brandName);
	System.out.println(" c1 : "+c1.e.type);
	System.out.println(" c : "+c.e.type);
	}
}
class Car implements Cloneable{
	String brandName ="BMW";
	String model = "M5";
	Engine e=new Engine();
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Engine{
	String type="petrol";
	
}
