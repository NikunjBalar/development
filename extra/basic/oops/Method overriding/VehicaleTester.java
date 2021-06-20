public class VehicaleTester{
	public static void main(String[] args){
		System.out.println("main  method started..");
		
		Vehicale v=new Vehicale();
		v.start();
		Bike bk=new Bike();
		bk.start();
		Car c=new Car();
		c.start();
		Truk t=new Truk();
		t.start();
		System.out.println("main method ended..");
	}
}

class Vehicale{
	
	public void start(){
		System.out.println("Vehicale satrted..");
	}
}

class Bike extends Vehicale{
	public void start(){
		System.out.println("Bike started using self..:");
	}
}

class Car extends Vehicale{
	public void start(){
		System.out.println("Car started using start---:");
	}
}

class Truk extends Vehicale{

}