class Demo
{
	int a;
	int x;
	long b;
	String name;
	
	Demo()
	{
		System.out.println("Default constructor....");
	}
	
	Demo(int x,int a)
	{
		this();
		System.out.println(" 2 param constructor....");
	}
	Demo(String name,int a, int x)
	{
		this();
		System.out.println(" 3 param constructor....");
	
	}
}

class DemoTester{
	public static void main(String[] args){
	
	Demo d1= new Demo();
	
	Demo d2= new Demo(20,30);
	
	Demo d= new Demo("Paras",10,20);
	}
}