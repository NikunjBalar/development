class CalciTester{
	public static void main(String [] args){
		System.out.println("main method started");
		Calculator c=new Calculator();
			c.a=10;
			c.b=20;
			c.calculateSum();
		
		Calculator c1=new Calculator();
			c1.a=20;
			c1.b=40;
			c1.calculateSum();
			int sum =c.findSum(30,40);
				System.out.println(c1);
			System.out.println("sum="+sum);
			System.out.println("main method endded..");

	}
}	