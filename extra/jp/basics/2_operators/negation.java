import java.util.Scanner;
class negation{
public static void main (String[] args)
{
Scanner scn=new Scanner(System.in);
int num;
System.out.println("enter a number");
num= scn.nextInt();
System.out.println("negation of that number is "+(~num));
}
}