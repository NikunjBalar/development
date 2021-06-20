import java.util.Scanner;

class DeletNumber{
	public static void main(String [] args){
		System.out.println("main method started");
		int i=0;
		int j=0;
		int [] old=new int [5];
		int [] even=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		for (i=0;i<old.length;i++){
			old[i]=sc.nextInt();
		}	
		for (i=0; j<even.length;i++){
			if (i!=2)
			{
				even[j]=old[i];
				j++;
			}
		}
		System.out.println("new arry");
		for(i=0;i<even.length;i++){
			System.out.println(even[i]+"\t");
		}
	}
}