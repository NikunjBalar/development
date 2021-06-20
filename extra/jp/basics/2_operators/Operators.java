class Operators
{
public static void main(String[] args)
{
System.out.println("main method has started!");
int a=10, b=20, res=0, value=90;
	if(a>b)
	{
	 res=a;
	}
	else if(b>a)
	{
	 res=b;
	}

System.out.println("the result is "+res);

	if(res!=a)
	{
	 System.out.println("result is not equal to a.");

	}
	if(res==b)
	{
	 System.out.println("result is equal to b.");
	}
System.out.println("we will print boolean values now");
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);
System.out.println(a==b);
System.out.println(a!=b);
System.out.println("main method has ended now.");

}
}