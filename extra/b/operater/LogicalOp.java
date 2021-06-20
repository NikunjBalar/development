class LogicalOp{
	public static void main(String [] args){
		System.out.println("main method started..");
		int a=30,b=40;
		boolean res=false;
		res=(a==30)||(b==40);
		System.out.println("(a==30)||(b==40)"+res);
		res=(a>b)||(a==b);
		System.out.println(res);
		res=(b>a)||(a>b);
		System.out.println(res);
		res=(b==a)||(a==b);
		System.out.println(res);
	}
}