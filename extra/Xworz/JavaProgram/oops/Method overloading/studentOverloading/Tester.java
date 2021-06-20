class Tester{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "paras";
		s.id=123;
		s.gotoinstitute();
		
		Bus bs = new Bus();
		bs.rootName = "MF-12";
		bs.division = "BMTC";
		
		s.gotoinstitute(bs);
	}
}