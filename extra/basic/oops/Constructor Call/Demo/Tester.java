class Demo{
	int a;
	int x;
	long b;
	String name;
	
	Demo(){
		System.out.println("Default constructor");
	}
	Demo(int x,int a){
		this();
		System.out.println("2 param constructor");
		this();
	}
	Demo(String name,int a,int x){
		System.out.println("3 param constructor");
	
	}
	Demo(long b){
		this("abc",12,12);
		System.out.println("1 param constructor");
	}
}

class Tester{
	public static void main(String[] args){
		System.out.println("main method started ");
		
		Demo d1=new Demo();
		System.out.println(".........");
		
		Demo d2=new Demo(12,34);
		
		System.out.println("main method ended..");
	}
}