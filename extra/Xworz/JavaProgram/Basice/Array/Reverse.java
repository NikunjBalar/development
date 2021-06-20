import java.util.*;

class Reverse{
	public static void main(String[] args)
	{
		System.out.println("main method started........................");
		Scanner sc =new Scanner(System.in);
		int r,sum=0,temp,n;
		System.out.println("Enetr the number");
		n=sc.nextInt();
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
	System.out.println("Reverse number"+sum);
	System.out.println("main method ended..................");
	}
}