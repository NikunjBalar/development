class TesterCar1{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Car car=new Car();
		car.brandName="honda";
		car.modelName="city";
		car.Price=1200000.12651726;
		
		Engine engine=new Engine();
		MusicSystem sound=new MusicSystem();
		
		car.engine=engine;
		engine.brandName="xyz";
		
		car.sound=sound;
		sound.brandName="f&d";
		sound.modelName="city";
		
		System.out.println("car engine="+car.engine.brandName);
		System.out.println("car MusicSystem="+car.sound.brandName);
		System.out.println("car MusicSystem="+car.sound.modelName);
		
		System.out.println("main method ended..");
	}
}

class Car{
	static String brandName;
	String modelName;
	double Price;
	Engine engine;
	MusicSystem sound;
}

class Engine extends Car{
	//String BrandName="xyz";
	String Capacity="450cc";
	String Type="petrol";
	
}

class MusicSystem extends Car{
	//String BrandName="f&d";
	//String modelName="f95";
	//double price=20000.2313;
}