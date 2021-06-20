class ArrayIntCalculator{
	public static void main(String [] args){
		System.out.println("main method started..");
		int[] cal={12,23,-53,45,23,45,-34};
		int sum=0;
		for(int i=0; i<cal.length; i++){
			sum+=cal[i];
			//sum=sum+cal[i];
			
		}
		System.out.println("sum of cal elements="+sum);
		System.out.println("avrrage of array elements="+(sum/cal.length));
		
		System.out.println("main method ended...");
	}
}