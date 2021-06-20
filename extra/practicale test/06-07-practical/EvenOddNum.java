class EvenOddNum{
	public static void main(String[] a){
		System.out.println("main method started...");
		int even=0;
		int odd=0;
		for(int i=0; i<=20; i++){
			if(i%2==0){
				even+=i;
			}
			else{
				odd+=i;
			}
			
		}
		
		System.out.println(even);
		System.out.println(odd);
		System.out.println("main method ended..");
	}
}