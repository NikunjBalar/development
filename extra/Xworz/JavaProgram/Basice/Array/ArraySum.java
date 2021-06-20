class ArraySum
	{
	public static void main(String[] args){

		System.out.println("main method start.......");
		int[] arr={10,20,-5,0,-3};
		int sum=0;
			
		for(int i=0;i<arr.length;i++){
		sum = sum + arr[i];
		}
		System.out.println("sum of array elements="+sum);
		//System.out.println("Average  of array elements="+(sum/arr[i]));
		System.out.println("main method ended.......");
		
		
	}	


}