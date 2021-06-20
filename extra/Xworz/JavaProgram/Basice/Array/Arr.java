import java.util.Scanner;

class Arr{
	public static void main(String[] args)
	{
	System.out.println("main method start....");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter the elements of array"+(++count));
		arr[i]=sc.nextInt();
	}
	int oddSum=0;
	int evenSum=0;
		System.out.println("display array elements are");
	for(int i=0;i<arr.length;i++)
	{
		//System.out.println(i+"---->"+arr[i]);
		System.out.println(arr[i]+"\t");
		if(arr[i]%2==0)
				evenSum=evenSum+arr[i];
			else
				oddSum=oddSum+arr[i];
	}
	System.out.println("main method ended....");
	}

}