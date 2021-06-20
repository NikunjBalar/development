package assignment;

public class SecondLargestNum {
	public static void main(String[] args) {
		SecondLargestNum sl=new SecondLargestNum();
		sl.secondLarge();
	}
	void secondLarge() {
		int[] arr= {3,5,8,4,2,6,9};
		int a=0;
		int b;
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			temp=a;
			b=arr[i];
			if(a<=b) {
				a=b;
			}
			else if (a>=b){
				temp=a;
			}
			
		}
		System.out.println();
	}
}
