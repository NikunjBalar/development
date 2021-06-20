import java.util.Scanner;

class ArrayLength{
	public static void main(String[] ar){
		System.out.println("main method started..");
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("enter the number of element : ");
		//n=sc.nextInt();
		int[] a=new int[100];

		for(int i=0;i<12;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<12;i++){
			if(a[i]!=0){
			count++;
			}
		
		}
		
		System.out.println("Array Length : "+ count);
		System.out.println("main method ended..");
	}
}