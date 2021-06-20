import java.util.Scanner;

class BooleanWhile{
	public static void main(String []args){
		boolean status=true;
			int res=0;
			int a=10,b=20;
			res=a+b;
			Scanner sc=new Scanner(System.in);
			status=sc.nextBoolean();
			System.out.println(res);
			System.out.println("true");			
			System.out.println("main method end");
	}
}