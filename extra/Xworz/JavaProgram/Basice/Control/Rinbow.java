import java.util.Scanner;
import java.util.*;

class Rinbow{
	public static void main(String[] args){
		System.out.println("Main method started..");
		
		Scanner sc = new Scanner(System.in);
		String opr = sc.nextLine(); 
		System.out.println("Enter colour");
		char c=sc.next().charAt(0);
				

		if(c=='V')
			System.out.println("voilet");
		else if(c=='i' && c!='v')
			System.out.println("indigo");
		else if(c=='b' && c!='i')
			System.out.println("blue");
		else if(c=='g' && c!='b')
			System.out.println("green");
		else if(c=='y' && c!='g')
			System.out.println("yellow");
		else if(c=='o' && c!='y')
			System.out.println("orange");
		else if(c=='r' && c!='o')
			System.out.println("red");
		else
			System.out.println("no such colour available");
		System.out.println("main method execution stop"); 
	}
}