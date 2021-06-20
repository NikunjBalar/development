import java.util.Scanner;

class Value{
	public static void main(String[] args){
	int a,b;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a value a:");
	a= scan.nextInt();
	System.out.println("Enter a value b:");
	b= scan.nextInt();
	
	if(a>b){
	System.out.println("a is big");
	}
	else{
	System.out.println("b is big");
	}
	}
}