class Student{
	int id;
	String name;
	long phoneNumber;
	
	void gotoinstitute(){
		System.out.println("by walk....");
		
	}
	
	void gotoinstitute(Bike b){
		System.out.println("going by bike"+b.name+"\t"+b.regNum);
	
	}
	
	void gotoinstitute(Car c){
	System.out.println("using car"+c.name+"\t"+c.regNum);
	}
	void gotoinstitute(Bus b){
		System.out.println("using bus"+b.routnumber+"\t"+b.routname);
	}
}