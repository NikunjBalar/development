import java.util.Scanner;
import java.util.*;
class SwichWLoop{
	public static void main(String [] args){
		System.out.println("main method started ...");
		//char c,statusvalue;
		String resString ="pp";
		
		int ch=7;
		//int res1;
		
		//System.out.println(resString);
		boolean status=true;
		while(status){
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter color name");
			ch=sc.next().charAt(0);
			
			switch (ch){
				case 1:
					resString = "v";
					System.out.println("v="+"violet");
					break;
				case 2:
					resString = "i";
					System.out.println("i="+"indigo");
				case 3:
					resString = "b";
					System.out.println("b="+"blue");
				case 4:
					resString = "g";
					System.out.println("g="+"green");
				case 5:
					resString = "y";
					System.out.println("y="+"yellow");
				case 6:
					resString = " o";
					System.out.println("o="+"orange");
				case 7:
					resString = "r";
					System.out.println("r="+"red");
				default:
						System.out.println("lol.....,hahahahah,no such case available");
			}
			System.out.println(resString);
			System.out.println("don't continue press N");
			statusvalue=sc.next().charAt(0);
			if(statusvalue=='n'||statusvalue=='N'){
				status= false;
			}
			
		 
		}
	}
}