
import java.util.Scanner;
class  random
{
	public static void main(String[] wordz) 
	{
		double y; double x;
		System.out.println("enter a number\n");
		Scanner s=new Scanner(System.in);
		y=s.nextDouble();
		if(y==(double)y)
			{
        System.out.println("entered number is:"+y);
			}
		else System.out.println("NO CHEATING");
		
		x=Math.random()*78+1;
		System.out.println("a random number generated is:"+x);
	}
}
