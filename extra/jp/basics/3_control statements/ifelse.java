import java.util.Scanner;
class ifelse{
public static void main(String[] args)
{
float p;
Scanner scn= new Scanner(System.in);

System.out.println("give your percentage of grades");

p=scn.nextFloat();

if(p>=75)
System.out.println("that is distinction class");

else if((p>=60)&&(p<75))
System.out.println("that is first class");

else if((p>=50)&&(p<60))
System.out.println("that is second class");

else if((p>=35)&&(p<50))
System.out.println("that is pass class");

else
System.out.println("fail");
}
}