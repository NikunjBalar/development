import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num,fact=1;
		boolean flag = false;
        System.out.print("enter the nmbers if you want:");
		num = sc.nextInt();
        
        for(i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}