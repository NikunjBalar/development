import java.util.*;
class Factorial{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int i, num1,fact=1;
        System.out.print("enter the nmbers if you want:");
		num1 = sc.nextInt();
        for (i = 1; i<num1; i++)
        {
            fact = fact*i;
        }
		System.out.print("Factorial of "+fact+" number:");
    }
}