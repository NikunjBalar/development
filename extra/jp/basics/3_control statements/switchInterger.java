import java.util.Scanner;
class switchInterger{
public static void main(String[] args)
{
int opt;
float a, b, res;
Scanner scn=new Scanner(System.in);

System.out.println("enter any two numbers");
a=scn.nextFloat();
b=scn.nextFloat();

System.out.println("choose the coressponding numbers for the operation listed\n1.addition\t2.subtraction\t3.multiplication\t4.division");
opt=scn.nextInt();

switch(opt)
{
case 1:res=a+b;
System.out.println("the result is"+res);
break;
case 2:res=a-b;
System.out.println("the result is"+res);
break;
case 3:res=a*b;
System.out.println("the result is"+res);
break;
case 4:res=a/b;
System.out.println("the result is"+res);
break;
default:
System.out.println("don't fuck with the computer and choose one of the four options.");
}
}
}