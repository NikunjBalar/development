//import java.util.Scanner;
class IncrementOrder{
	public static void main(String[] args){
		System.out.println("main method started");
		
		int n,temp;
	//	Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number of element");
		 //n=sc.nextInt();
		int[] a={12,23,34,45,54,32,21,1};
		//System.out.println("Enter all element...");
		//for(int i=0;i<n;i++){
		//		a[i]=sc.nextInt();
		//}
		n=a.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("ascending Order:");
		for(int i=0;i<n-1;i++){
			
			System.out.print(a[i]+",");
		}
		System.out.println(a[n-1]);
		System.out.println("main method ended...");
	}
}