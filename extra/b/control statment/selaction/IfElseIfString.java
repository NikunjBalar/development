import java.util.Scanner;

class IfElseIfString{
	public static void main(String [] args){
		System.out.println("Enter your colour");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		if(s.equals("r"))
			System.out.println("red");
		else if(s.equals("o"))
			System.out.println("orange");
		else if(s.equals("y"))
			System.out.println("yellow");
		else if(s.equals("g"))
			System.out.println("green");
		else if(s.equals("b"))
			System.out.println("blue");
		else if(s.equals("i"))
			System.out.println("indigo");
		else if(s.equals("v"))
			System.out.println("violet");
		else
			System.out.println("no such colour available");
		System.out.println("main method exicution stop");



	}
}