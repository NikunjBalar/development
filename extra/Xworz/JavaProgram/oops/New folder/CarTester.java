class Car{
	String brand;
	String model;
	String Color;
	double Price;
	String ac;
	String airbag;
	
	/*Car(){
		System.out.println(" Default constructor.....");
	}*/
	
	Car(String brand, String model, String Color){
		
		this.brand= brand;
		this.model = model;
		this.Color = Color;
		//this.Price = Price;
		//this.ac = ac;
		//this.airbag = airbag;
		
	}
	
	Car(String brand, String model, String Color,double Price){
		
		
		this(brand,model,Color);
		this.Price = Price;

	}
	
	Car(String brand, String model, String Color,double Price,String ac){
		
		this(brand,model,Color,Price);
		this.ac = ac;
		//this.airbag = airbag;
		
	}
	
	
	void getDetails(){
	System.out.println("brand:"+this.brand+"\n model:"+this.model+"\n Color:"+this.Color+"\n Price:"+this.Price+"\n ac:"+this.ac+"\n airbag:"+this.airbag);
	}
	
}
class CarTester{
	public static void main(String[] args){
		System.out.println("Main method started......... ");
		
	/*	Car c = new Car("Honda","city","black",2500000d,"ac");
		System.out.println(" 3 param constructor.....");
		Car c1 = new Car("Honda","city","black",2530000d);
		System.out.println(" 4 param constructor.....");*/
		Car c2 = new Car("Honda","city","black",2500000d,"ac");
		System.out.println(" 5 param constructor.....");
		c2.getDetails();
		System.out.println("Main method ended............");
	}
}