import java.util.*;

class BasicMathTester{
	public static void main(String[] args){
		System.out.println("Main method start...............................");
		Scanner sc = new Scanner(System.in);
		BasicMath bm = new BasicMath();
		System.out.println("enter the value of a:");
		int a= sc.nextInt();
		System.out.println("enter the value of b:");
		double b= sc.nextDouble();
		bm.findSum(a,b);
		
		System.out.println("enter the value of n:");
		int n= sc.nextInt();
		bm.findSquare(n);
		
		
		System.out.println("enter the value of m:");
		int m= sc.nextInt();
		bm.findCube(m);
		
		System.out.println("enter the value of p:");
		double p= sc.nextDouble();
		System.out.println("enter the value of t:");
		int t= sc.nextInt();
		System.out.println("enter the value of r");
		double r= sc.nextDouble();
		bm.findSimpleInterest(p,t,r);
		
		double[] marks ={59,68,69,85,78,59};
		double d = bm.findPercentage(marks);
		System.out.println("percentage"+d);
		System.out.println("main method is ended..............................");
		
		
	}
}