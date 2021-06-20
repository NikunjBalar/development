class Increment
{
	public static void main(String[] args)
	{
		int a= -5,b=2,res= 0;
		System.out.println(a+"\n"+b);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		res= (a++)+b;
		System.out.println(res);
		res=++a+b;
		System.out.println(res);
		
	}
}