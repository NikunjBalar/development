import java.util.*;
class Fibonacci{
	public static void main(String[] args)
	{

        int i, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+num1+" numbers:");

        for (i = 1; i <= 10; ++i)
        {
            System.out.print(num1+" ");

            
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}