class VehicleTester{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Vehicle v=new Engeen();
		v.start();
		//v.wheeling(); can not acces child class member function.
		
		Bike b=new Engeen();
		b.start();
		b.wheeling();
		//b.working();
		
		System.out.println(b.regNum);
		System.out.println("main method ended...");
	}
}

class Vehicle{
	String regNum="asg7898bzjb ";
	String name;
	
	void start(){
		System.out.println("Vehicle started..");
	}
}

class Bike extends Vehicle{
	String type;
	
	void start(){
		System.out.println("Bike start..");
	}
	void wheeling(){
		System.out.println("wheeling..");
	}
}

class Engeen extends Bike{
	void working(){
		System.out.println("Engeen is worling..");
	}
}