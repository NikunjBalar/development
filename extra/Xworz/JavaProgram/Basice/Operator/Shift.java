class Shift
{
	public static void main(String[] args)
	{
		int a= 6, b=0,res= 0;
		
		res= a<<3;
		System.out.println("6<<3="+res);
		res= a<<4;
		System.out.println("6<<4="+res);


		res= 8>>4;
		System.out.println("6>>4="+res);

		a=5;
		b=3;
		System.out.println("5&3="+(a&b));
		System.out.println("5|3="+(a|b));
		System.out.println(~a);
		
		
	}
}