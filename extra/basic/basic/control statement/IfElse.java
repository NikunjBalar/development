import java.util.Scanner;

class IfElse{
	public static void main(String []args){
		System.out.println("mai method started...");
		Scanner sc=new Scanner(System.in);
		int a,b;
			System.out.println("enter your value");
			a=sc.nextInt();
			b=sc.nextInt();
			
		if(a>=b){
			System.out.println("a is bigger than b");
		}
		else{
			System.out.println("b is bigger than a");
		}
	}
}