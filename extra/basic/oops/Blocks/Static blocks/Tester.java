class Sample{
	int i;
	static int j;
	
	static{
		System.out.println("inside statuc block");
		j=20;
		//i=10; error
	}
	
	
	Sample(){
		System.out.println("Default constructor..");
		i=20;
		//j=200; static ,not a good practice
	}
	
	static{
		System.out.println("inside static block 2 ");
		j=200;
	}
}

class Tester{
	public static void main(String[] args){
		Sample s1= new Sample();
		System.out.println("j="+Sample.j);
		
		Sample s2=new Sample();
		System.out.println("j="+s2.j+"\ni="+s2.i);
	}
}