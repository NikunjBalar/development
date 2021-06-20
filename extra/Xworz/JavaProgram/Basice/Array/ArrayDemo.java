import java.util.Scanner;
public class ArrayDemo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter elements how many u want");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter the elements of array");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("display array elements");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"---->"+arr[i]);
}}}