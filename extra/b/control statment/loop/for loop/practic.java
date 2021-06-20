import java.util.Scanner;
class practic{
 public static void main(String [] args){
  int a,b;

   Scanner sc=new Scanner(System.in);
 
   System.out.println("enter value of a");
   a=sc.nextInt();
 
   System.out.println("enter value of b");
    b=sc.nextInt();
   for(int i=a;i<=b;i++){
    System.out.println(i);
  }
 }
}