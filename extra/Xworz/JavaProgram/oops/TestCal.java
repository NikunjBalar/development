class TestCal{
	public static void main(String[] args){
		System.out.println("main method started.......");
		
		Calculater c = new Calculater();
		
		c.a=10;
		c.b=20;
		
		c.calculate();
		
		int value= c.finddiff(40,30);
		System.out.println(value);
		System.out.println("main method ended........");
	}

}