import java.util.Scanner;

class SwepWithScanner{
	public static void main(String[] args){
		System.out.println("main method started...");
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		int temp=0;
		System.out.println("enter the value of a=");
		a=sc.nextInt();
		System.out.println("Enter the value of b=");
		b=sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\n a="+a);
		System.out.println("b="+b);
		
		
		System.out.println("main method ended....");
	}
}