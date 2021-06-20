import java.util.Scanner;

class AssignmentConcadination{
	public static void main(String[] args){
		System.out.println("Main method startd..");
		String a;
		char b;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		a=sc.nextLine();
		System.out.println("enter number ");
		n=sc.nextInt();
		System.out.println("enter character");
		b=sc.next().charAt(0);
		
		System.out.println(a+n);
		System.out.println(a+b);
		System.out.println(n+b);
		System.out.println("Main method ended..");
	}
}