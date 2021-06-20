import java.util.Scanner;
import java.util.*;

class colorWhil{
	public static void main(String[] args){
		System.out.println("Main method started..");
		boolean status=true;
		int color = 7;
		while(status)
		{
			
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter colour");
		c=sc.next().charAt(0);
         
        switch (color) { 
        case 1: 
            colorString = "voilet"; 
            break; 
        case 2: 
            color*tring = "indigo"; 
            break; 
        case 3: 
            colorString = "blue"; 
            break; 
        case 4: 
            colorString = "green"; 
            break; 
        case 5: 
            colorString = ""; 
            break; 
        case 6: 
            colorString = "yellow"; 
            break; 
        case 7: 
            colorString = "orange"; 
            break; 
        default: 
            colorString = "no such colour available"; 
            break; 
        }		
		System.out.println(colorString);
		System.out.println("Do you want to continue??  Press Y or don't continue press N");
		statusvalue = sc.next().charAt(0);
		if(statusvalue=='n'||statusvalue=='N')
		{
			status= false;
		}
		
		}
	}
}