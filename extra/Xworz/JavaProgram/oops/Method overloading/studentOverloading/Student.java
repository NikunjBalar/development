class Student{
	String name;
	int id;
	long phoneNumber;
	
	void gotoinstitute(){
	System.out.println("Student go by walk");
	}
	
	void gotoinstitute(Bike b){
	System.out.println("Student go by bike"+b.name);
	}
	
	void gotoinstitute(Car c){
	System.out.println("Student go by car"+c.name);
	}
	
	void gotoinstitute(Bus bs){
	System.out.println("Student go by Bus"+bs.rootName);
	}
}