package assignment;

import java.util.Arrays;

public class TwoArryInOne {
	public static void main(String[] args) {
		TwoArryInOne ta=new TwoArryInOne();
		ta.twoArry();
	}
	void twoArry() {
		int[] arr1= {1,2,4,5};
		int[] arr2= {3,6,8,7};
		
		int a=arr1.length;
		int b=arr2.length;
		int[] arr3=new int[a+b];
		for (int i = 0; i < arr3.length; i++) {
			if (i<a) {
				arr3[i]=arr1[i];
			} else {
				arr3[i]=arr2[i-a];
			}
		}
		
		//System.arraycopy(arr1, 0, arr3, 0, a);
		//System.arraycopy(arr2, 0, arr3, a, b);
		
		System.out.print(Arrays.toString(arr3));
	}
}
