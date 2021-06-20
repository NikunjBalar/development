class Logicaloperators{
	public static void main(String[] args){
		int a=10, b=20;	
		boolean res = false;
		res = (a==30)&&(b==20)
		System.out.println(res);
		res = (a>b)&&(a==b)
		System.out.println(res);
		res = (b>a)&&(a>b)
		System.out.println(res);
		res = (b==a)&&(a==b)
		System.out.println(res);
	}
}