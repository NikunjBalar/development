package com.java.ObjectClass;

public class DeepCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car1 c=new Car1();
		Car1 c1=(Car1) c.clone();
		c.brandName="Audi";
		c1.e.type="diesel";
		System.out.println(" c : "+c.brandName);
		System.out.println(" c1 : "+c1.brandName);
		System.out.println(" c1 : "+c1.e.type);
		System.out.println(" c : "+c.e.type);
	}
}
	class Car1 implements Cloneable{
		String brandName ="BMW";
		String model = "M5";
		Engine1 e=new Engine1();
		public Car1 clone() throws CloneNotSupportedException {
			Car1 car1= (Car1) super.clone();
			car1.e=new Engine1();
			return car1;
	}
}
	class Engine1{
		String type="petrol";
		
}
