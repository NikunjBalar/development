import java.util.Scanner;
import java.util.*;

class SwitchWhil{
	public static void main(String[] args){
		System.out.println("Main method started..");
		char c,statusvalue;
		boolean status=true;
				
		while(status)
		{
			
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter colour");
		c=sc.next().charAt(0);
		
		if(c=='V'||c=='v')
			System.out.println("voilet");
		else if(c=='i'||c=='I')
			System.out.println("indigo");
		else if(c=='b'||c=='B')
			System.out.println("blue");
		else if(c=='g'||c=='G')
			System.out.println("green");
		else if(c=='y'||c=='Y')
			System.out.println("yellow");
		else if(c=='o'||c=='O')
			System.out.println("orange");
		else if(c=='r'||c=='R')
			System.out.println("red");
		else
			System.out.println("no such colour available");
			System.out.println("Do you want to continue??  Press Y or don't continue press N");
		
		statusvalue = sc.next().charAt(0);
		if(statusvalue=='n'||statusvalue=='N')
		{
			status= false;
		}
		
		}
	}
}