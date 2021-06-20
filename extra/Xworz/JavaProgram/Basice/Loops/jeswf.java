import java.util.Scanner;
import java.util.*;

class jeswf{
	public static void main(String[] args){
		System.out.println("Main method started..");
		
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Enter course");
		char c=sc.next().charAt(0);
				

		
		if (c=='j' && c=='J')
			System.out.println("java");
		if else if(c==e' && c=='E')
			System.out.println("jee");
		if else if(c=='s' && c=='S')
			System.out.println("SQL");
		if else if(c=='w' && c=='W')
			System.out.println("W&T");
		if else if(c=='f' && c=='F')
			System.out.println("FreamWork");
		 else
			System.out.println("no such course available");
		System.out.println("main method execution stop"); 
	}
}