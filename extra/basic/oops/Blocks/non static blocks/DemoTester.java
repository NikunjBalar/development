class Demo{
	int i;
	static int j;
	{
		i=10;
		System.out.println("inside Non static blocks 2");
		j=20;// not a standerd practice
	}
	
	Demo(){
		System.out.println("Default constructor..");
	}
	
	{
		System.out.println("inside non static blocks");
	}
}

class DemoTester{
	public static void main(String[] ar){
		System.out.println("mms");
		
		Demo d1=new Demo();
		System.out.println("i="+d1.i);
		System.out.println("j="+Demo.j);
		System.out.println("-----------");
		
		Demo d2= new Demo();
		
		System.out.println("mme");
	}
}