import java.util.Scanner;
class Scanning{
public static void main(String[] args)
{
float age;
Scanner sc=new Scanner(System.in);

System.out.println("enter your age");
age=sc.nextFloat();

if(age<18)
{
System.out.println("you aren't authorized for anything yet.");
}

else if((age>=18)&&(age<25))
{
System.out.println("you are authorized for voting. \n you are not authorized for skidiving in most countries");
}

else 
if(age>25)
{
System.out.println("you are authorized to do whatever the fuck you want");
}

}
}