import java.util.*;

class DeletNumber2{
	public static void main (String args[])
	{
		System.out.println("main method started..");
		int []input={1,2,3,4,5};
		int [] a=new int[4];
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the element..");
		//for(int i=0;i<input.length;i++){
		//	input[i]=sc.nextInt();
		//
		//int i=5;
		int j=0;
		System.out.println("length:"+input.length);
		for(int i=0;i<=(input.length)-1;i++)
		{
			if(i==2)
            {
				//a[i]=a[i+1];
				i++;
			}
			
			a[j]=input[i];
			j++;
			
		}
		
		for(j=0;j<=a.length-1;j++){
			System.out.println(a[j]);
		
		}
		
		
		
	}
}