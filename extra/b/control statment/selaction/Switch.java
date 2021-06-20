import java.util.Scanner;

class Switch{
	public static void main(String [] args){
	System.out.println("main mehtod started...");
	System.out.println("Simple calculator program..\nchppse folliwing option.\n1.add\n2.Subtract\n3.multiply\n4.division");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int res=0;

		switch (opt){
			case 1:res=a+b;
				System.out.println("a+b="+res);
				break;
			case 2:res=a-b;
				System.out.println("a-b="+res);
				break;
			case 3:res=a*b;
				System.out.println("a*b="+res);
				break;
			case 4:res=a/b;
				System.out.println("a/b="+res);
				break;
			default:
				System.out.println("No such case available");
		}
		System.out.println("main method ended.");
	}
}