import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		System.out.println("Main method started..");
		System.out.println("Simple Calculator program..\nChoose following options"
			+"\n1.Add\t2.Subtract\t3.Multiply\t4.Divide");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res= 0;

		switch(opt){
		           case 1: res =a+b;
		          	System.out.println("sum="+res);
			break;
		           case 2: res =a-b;
		          	System.out.println("Difference="+res);
			break;
		           case 3: res =a*b;
		          	System.out.println("Product="+res);
			break;
		           case 4: res =a/b;
		          	System.out.println("Quotient="+res);
			break;
		           default:
		          	System.out.println("No such cases available");
		}
		System.out.println("main method execution stop");
	}
}