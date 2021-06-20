import java.util.Scanner;

class BasicMathtester{
	public static void main(String [] args){
		System.out.println("main method started...");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a ");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		double b=sc.nextDouble();
		
		BasicMath x=new BasicMath();
		double res=x.findSum(a,b);

		System.out.println("enter the value of m");
		int m=sc.nextInt();
		int res1=x.findSquare(m);
		
		System.out.println("Enter the vsle of n");
		int n=sc.nextInt();
		int res2=x.findCube(n);
		
		System.out.println("Enter the vsle of p");
		double p=sc.nextDouble();
		System.out.println("Enter the vsle of t");
		double t=sc.nextDouble();
		System.out.println("Enter the vsle of r");
		double r=sc.nextDouble();
		double res3=x.findSimpleInterest(p,t,r);
		
		double [] markes={68,45,44,45};
		double res4=x.findPercentage(markes);
		System.out.println("percentage of student markes is "+res4);
		
		System.out.println();
		System.out.println(res);
	}
}