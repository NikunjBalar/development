class TesterAnimal{
	public static void main(String[] args){
		System.out.println("main method starting..");
		
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		BabyDog bd=new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
		
		Cat c=new Cat();
		c.eat();
		c.meow();
		
		//System.out.println("Dog Details"+d.eat+"\t"+d.bark);
		//System.out.println("BabyDog Details"+bd.eat+"\t"+bd.bark+"\t"+bd.weep);
		//System.out.println("Cat Details"+c.eat+"\t"+c.meow);
		System.out.println("main methodended..");
	}
}

class Animal{
	String type;
	
	void eat(){
		System.out.println("Eatting..");
		
	}
}

class Dog extends Animal{
	
	void bark(){
		System.out.println("Barking..");
	}
}

class BabyDog extends 
{
	
	void weep(){
		System.out.println("weeping..");
	}
}

class Cat extends Animal{
	
	void meow(){
		System.out.println("Meowing..");
	}
}

