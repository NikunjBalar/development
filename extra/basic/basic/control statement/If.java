import java.util.Scanner;

class If{
	public static void main(String []args){
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int a=sc.nextInt();
		
		if(a>=18){
			System.out.println("you can give the vote");
		}
	}
}