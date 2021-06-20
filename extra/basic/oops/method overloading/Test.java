class Test{
	public static void main(String []args){
		System.out.println("main method started..");
		Student s=new Student();
			s.Name="nikunj";
		
		Bus bs=new Bus();
			bs.routnumber="MF-12";
			bs.routname="BMTC";
			
		Car c=new Car();
			c.Name="ola";
			c.regNum="nikunj";
	
		s.gotoinstitute(bs);
		s.gotoinstitute(c);
	}
}

class Bus{
	String routnumber;
	String routname;
}

class Car{
	String Name;
	String regNum;
}

class Student{
	String Name;
	
	void gotoinstitute(Bus bs){
		System.out.println("Go to institute by bus...;");
	}
	
	void gotoinstitute(Car c){
		System.out.println("Go to institute by car...");
	}
}