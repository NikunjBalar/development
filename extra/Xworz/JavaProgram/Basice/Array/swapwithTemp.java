import java.util.*;
class swapwithTemp{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.println("in this swaptemp start....");
		System.out.println("enetr the value of a:");
		a=sc.nextInt();
		System.out.println("enetr the value of b:");
		b=sc.nextInt();
		 
		temp = a;
		a=b;
		b=temp;
		
		/*a=a+b;
		b= a-b;
		a=a-b;*/
		
		System.out.println("A"+a+ "\tB"+b );
		System.out.println("in this swaptemp ended....");
	}
}