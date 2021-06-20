package com.xworkz.progrm;

public class ArrayProgrm {
	public static void main(String[] args) {
		int[] arr= {0,1,3,2,3,6,2,6,7,1,2};
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<=arr.length-2;j++)
				
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
					break;
				
				}
				
	
			}
		

			
		}
	}
}
