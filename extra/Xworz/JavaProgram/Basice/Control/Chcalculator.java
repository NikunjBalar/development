import java.util.Scanner;

class Chcalculator{
	public static void main(String[] args){
		System.out.println("Main method started..");
		System.out.println("Simple Calculator program..\nChoose following options"
			+"\na. Add\tb. Subtract\tc.Multiply\td. Divide");
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res= 0;

		switch(ch){
		           case 'a': res =a+b;
		          	System.out.println("sum="+res);
			break;
		           case 'b': res =a-b;
		          	System.out.println("Difference="+res);
			break;
		           case 'c': res =a*b;
		          	System.out.println("Product="+res);
			break;
		           case 'd': res =a/b;
		          	System.out.println("Quotient="+res);
			break;
		           default:
		          	System.out.println("No such cases available");
		}
		System.out.println("main method execution stop");
	}
}