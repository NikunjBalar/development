class Car{
	String brand;
	String model;
	String color;
	double price;
	String ac;
	String airbag;
	
	Car(){
		System.out.println("Default consuctor ");
	}
	
	Car(String brand,String model,double price){
		System.out.println("3 param consuctor ");
		this.brand=brand;
		this.model=model;
		this.price=price;

	}
	
	Car(String brand,String model,double price,String ac){
		this(brand, model, price);
		//this("honda","city",125000.43365);
		System.out.println("4 param consuctor ");
		this.ac=ac;
	}
	
	Car(String brand,String model,double price,String ac ,String airbag){
		this(brand,model,price);
		//this("suzuki","baleno",20000000.324,"takata");
		System.out.println("5 param consuctor");
		this.airbag=airbag;
	}
	
	void getCarDetails(){
		System.out.println("car Detail\nBrand:"+this.brand+"\nModel:"+this.model
							+"\nPrice:"+this.price+"\nAc:"+this.ac+"\nAirbag:"+this.airbag);
	}
}

class CarTester{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Car c1=new Car();
		System.out.println("......");
		c1.getCarDetails();
		Car c2=new Car("suzuki","swift",1200000.342);
		c2.getCarDetails();
		System.out.println("main method ended...");
	}
}