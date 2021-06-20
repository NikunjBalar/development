import java.util.Scanner;

class IfElseIf{
	public static void main (String [] args){
	System.out.println("Enter your persentage...");
	Scanner sc= new Scanner(System.in);
	char perc=sc.next().charAt(0);

	if (perc>=75 && perc<101)
		System.out.println("FCD");
	else if (perc>=60&& perc<70)
		System.out.println("FC");
	else if (perc>=50 && perc<60)
	 	System.out.println("SC");
	else if (perc>=35 && perc<50)
		System.out.println("PASS");
	else 
		System.out.println("FAIL");
	
	System.out.println("main method execution stops");
	}
}