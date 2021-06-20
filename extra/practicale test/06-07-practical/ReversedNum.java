class ReversedNum{
	public static void main(String[] ar){
		System.out.println("main method started..");
		int n=1234,res=0;
		
		while(n!=0){
			int digit = n%10;
			res*=10+digit;
			n /= 10;
			System.out.print(digit);
		
		}
		System.out.println("Reversed Number : ");
		System.out.println("main method ended..");
	}
}