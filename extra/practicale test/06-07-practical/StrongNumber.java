import java.util.Scanner;
public class StrongNumber {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int num;
     int i,p,r;
     int sum = 0;
     int save_num;
  
     System.out.print("Enter a number: ");
     num = scan.nextInt();
     save_num = num;
     while(num != 0)
     {
        i =1;
        p = 1;
        r = num % 10;
        while(i <= r)
        {
           p = p * i;
           i++;
        }
        sum = sum + p;
        num = num / 10;
     }
     if(sum == save_num)
     {
        System.out.print(save_num+" is a strong number");
     }
     else
     {
        System.out.print(save_num+" is not a strong number");
     }
  }
}