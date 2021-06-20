class SwepNumber{
	public static void main(String [] args){
		System.out.println("Main method started...");
		
		int a=12,b=23;
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\n"+"a="+a);
		System.out.println("b="+b);
	}
}