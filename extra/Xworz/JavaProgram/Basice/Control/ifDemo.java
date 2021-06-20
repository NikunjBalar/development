import java.util.*;
class ifDemo
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	
	int age=sc.nextInt();
	
	if(age > 18)
	{
		System.out.println("Enter weight");
		int weight=sc.nextInt();
		if (weight>50)
		{
			System.out.println("eligible for donate blood");
		}
		else
		{
			System.out.println("not eligible for donate blood");
		}	
		
	}
	else
	{
		System.out.println("not eligible for donate blood");
	}
}
}