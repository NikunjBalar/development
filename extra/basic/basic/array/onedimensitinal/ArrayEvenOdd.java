import java.util.Scanner;
class ArrayEvenOdd{
	public static void main(String [] args){
		System.out.println("main method started...");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vlue=");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int count=0;
		for (int i=0; i<arr.length; i++){			
			System.out.println("Enter the value of "+(++count));
			arr[i]=sc.nextInt();
			
		}
		int evenSum=0;
		int oddSum=0;
		System.out.println("Enter array element are");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"\t");
				if(arr[i]%2==0)
					evenSum +=arr[i];
				else
					oddSum+=arr[i];
		}
		System.out.println("sum of even number is =="+evenSum);
		System.out.println("sum of odd number is =="+oddSum);
		System.out.println("main method ended.....");
	}
}