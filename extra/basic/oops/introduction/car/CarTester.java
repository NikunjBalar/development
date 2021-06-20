class CarTester{
	public static void main (String[] args){
		System.out.println("Main method started..");
		
		Car c1=new Car();
		c1.brandName="honda";
		c1.chassisNum=23645265423654872l;
		c1.modelName="city";
		c1.price=1234324.234;
		System.out.println("BrandName="+c1.brandName);
		System.out.println("chassisNum="+c1.chassisNum);
		
		Car c2=new Car();
		System.out.println("modelName="+c2.modelName);
		System.out.println(c2);
		
		System.out.println("Main method ended..");
	}
}