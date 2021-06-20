import java.util.Scanner;

class SwitchChar{
	public static void main(String [] args){
	System.out.println("main mehtod started...");
	System.out.println("Simple calculator program..\nchoose folliwing option.\na.add\nb.Subtract\nc.multiply\nd.division");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int res=0;

		switch (ch){
			case 'a' : res=a+b;
				System.out.println("a+b="+res);
				break;
			case 'b' : res=a-b;
				System.out.println("a-b="+res);
				break;
			case 'c' : res=a*b;
				System.out.println("a*b="+res);
				break;
			case 'd' : res=a/b;
				System.out.println("a/b="+res);
				break;
			default:
				System.out.println("No such case available");
		}
		System.out.println("main method ended.");
	}
}