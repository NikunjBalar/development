class TesterVehicle{
	public static void main(String[] arge){
		System.out.println("main method started..");
		
		Vehicle v=new Bike();
		v.brand="honda";
		v.start();
		
		//v.start("kicker"); error child specific function 
		//v.bikeType="moped"; child specific dm
		
		//v=new car();
		//Bike b=(Bike)v;
		
		if(v instanceof Bike){
			Bike bk=(Bike)v; //downcastig
			bk.start();
			bk.start("kicker");
			bk.wheeling();
		}
		else{
			System.out.println("there is no object");
		}
		
		System.out.println("main method ended...");
	}
}
class Vehicle{
	String brand;
	String model;
	String regNum;
	
	void start(){
		System.out.println("starting the vehicle ...");
	}
}
class Bike extends Vehicle{
	String bikeType;
	
	void start(){
		System.out.println("starting vehicle by using self..");
	}
	void start(String option){
		System.out.println("starting bike using kicker ...");
	}
	void wheeling(){
		System.out.println("wheeling...");
	}
}
class Car extends Vehicle{
	
}
