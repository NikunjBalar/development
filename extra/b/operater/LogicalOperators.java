class LogicalOperators{
	public static void main(String [] args){
		System.out.println("main method startd..");
		int a=30,b=20;
		boolean res=false;
		res=(a==30)&&(b==20);
		System.out.println(res);
		res=(a>b)&&(a==b);
		System.out.println(res);
		res=(b>a)&&(a>b);
		System.out.println(res);
		res=(b==a)&&(a==b);
		System.out.println(res);

	}
}