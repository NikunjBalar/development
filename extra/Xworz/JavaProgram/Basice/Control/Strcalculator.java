import java.util.Scanner;
import java.util.*;

class Strcalculator{
	public static void main(String[] args){
		System.out.println("Main method started..");
		System.out.println("Simple Calculator program..\nChoose following options"
			+"\n Add\t Subtract\t Multiply\t Divide");
		Scanner sc = new Scanner(System.in);
		String opr = sc.nextLine(); 
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res= 0;

		switch(opr){
		           case "Add": res =a+b;
		          	System.out.println("sum="+res);
			break;
		           case " Subtract": res =a-b;
		          	System.out.println("Difference="+res);
			break;
		           case "Multiply": res =a*b;
		          	System.out.println("Product="+res); 
			break;
		           case " Divide": res =a/b;
		          	System.out.println("Quotient="+res);
			break;
		           default:
		          	System.out.println("No such cases available");
		}
		System.out.println("main method execution stop");
	}
}