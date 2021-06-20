import java.util.Scanner;

class IfElseIfR{
	public static void main(String [] args){
		System.out.println("Enter your colour");
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);

		if(s=='r')
			System.out.println("red");
		else if(s=='o')
			System.out.println("orange");
		else if(s=='y')
			System.out.println("yellow");
		else if(s=='g')
			System.out.println("green");
		else if(s=='b')
			System.out.println("blue");
		else if(s=='i')
			System.out.println("indigo");
		else if(s=='v')
			System.out.println("violet");
		else
			System.out.println("no such colour available");
		System.out.println("main method exicution stop");



	}
}