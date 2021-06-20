import java.util.Scanner;

class SwitchString{
	public static void main(String [] args){
		System.out.println("main method sarted ..");
		System.out.println("simple calculater programme..\nChose from followingoption"+
			"\n + add\t - subtract\t * multiply\t / divide");

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("enter 2 number");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int res=0;
		System.out.println("value of a="+a+"and value of b="+b);

		switch (s){
			case  "+": res=a+b;
				System.out.println("a+b="+res);
				break;
			case "-": res=a-b;
				System.out.println("a-b="+res);
				break;
			case "*": res=a*b;
				System.out.println("a*b="+res);
				break;
			case "/": res=a/b;
				System.out.println("a/b="+res);
				break;
			default:
				System.out.println("No such case available");
		}
		System.out.println("main method ended.");
	}
}