import java.util.Scanner;

class Grades{
	public static void main(String[] args){
		System.out.println("Enetr your percentage...");
		Scanner sc = new Scanner(System.in);
		double perc = sc.nextDouble();

		if(perc>=70)
			System.out.println("FCD");
		else if(perc>=60 && perc<70)
			System.out.println("FC");
		else if(perc>=50 && perc<60)
			System.out.println("SC");
		else if(perc>=35 && perc<50)
			System.out.println("pass");
		else
			System.out.println("fail");
		System.out.println("main method execution stop");
	}

}