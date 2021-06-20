class Test{
	public static void main(String []args){
		System.out.println("main method started..");
		Student s=new Student();
			s.name="nikunj";
		
		Bus bs=new Bus();
			bs.routnumber="MF-12";
			bs.routname="BMTC";
			
		Car c=new Car();
			c.name="ola";
			c.regNum="nikunj";
	
		s.gotoinstitute(bs);
		s.gotoinstitute(c);
		s.gotoinstitute();
	}
}