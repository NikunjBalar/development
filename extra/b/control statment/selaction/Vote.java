import java.util.Scanner;

class Vote{
	public static void main(String [] args){
		int age=20;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		age=scan.nextInt();

		if(age>=18){
			System.out.println("VoterId issued...I can vote");

		}
	}
}