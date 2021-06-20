class Vehicle{
	public String brand;
	public String model;
	public String regNum;
	public double price;
	public String color;
	
	public void start(){
		System.out.println("vehicle started...");
	}
	
	public void stop(){
		System.out.println("Vehicle stopped...");
	}
	
	public void drive(){
		System.out.println("Driving the Vehicle..");
	}
	
	public void getVehicleDetails(){
		System.out.println("Vehicle Details...\n"+this.brand+"\n"+this.model+"\n"+this.regNum
							+"\n"+this.price+"\n"+this.color);
	}
}


class Bike extends Vehicle{
	
	public String type;
	
	public void wheeling(){
		System.out.println("wheeling...");
	}
	public void stoppy(){
		System.out.println("performing stoppy...");
	}
	
}

class TesterVehicle{
	public static void main(String[] args){
		System.out.println("main method Started..");
		
		Bike bk=new Bike();
		bk.type="moped";
		bk.brand="honda";
		bk.model="activa-5G";
		bk.regNum="gj-5-ck-5151";
		bk.price=75000;
		bk.color="black";
		
		bk.getVehicleDetails(); //inherited
		System.out.println(bk.type+"\n");
		
		bk.start(); //inherited
		bk.drive(); //inherited
		bk.wheeling(); //child specific
		bk.stoppy(); //child specific
		bk.stop(); //inherited
		
		System.out.println("main method ended...");
	}
}