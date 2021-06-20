class TesterCar{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Car car=new Car();
		car.brandName="honda";
		car.modelName="city";
		car.Price=1200000.12651726;
		
		Engine engine=new Engine();
		MusicSystem sound=new MusicSystem();
		
		car.engine=engine;
		car.sound=sound;
		
		System.out.println("car engine="+car.engine.BrandName);
		System.out.println("car MusicSystem="+car.sound.BrandName);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("main method ended..");
	}
}

class Car{
	String brandName;
	String modelName;
	double Price;
	Engine engine;
	MusicSystem sound;
}

class Engine{
	String BrandName="xyz";
	String Capacity="450cc";
	String Type="petrol";
	
}

class MusicSystem{
	String BrandName="f&d";
	String modelName="f95";
	double price=20000.2313;
}