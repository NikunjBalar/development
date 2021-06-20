class Sample{
	int i;
	static int j;
	
	static{
		System.out.println("inside static block...");
		
	}
	
	Sample(){
		System.out.println("Default constructor");
	}
	static{
		System.out.println("inside static block 2");
	}
	
	{
		System.out.println("inside non static block ");
	}
	
	{
		System.out.println("inside non Static block 2");
	}
	
	Sample(int i){
		this.i=i;
		System.out.println("1 param object ");
	}
}

class SampleTester{
	public static void main(String[] ar){
		System.out.println(Sample.j);
		
		Sample s1=new Sample(10);
		System.out.println(s1.j);
		System.out.println(s1.i);
		
		Sample s2=new Sample();
		System.out.println(s2);
	}
}