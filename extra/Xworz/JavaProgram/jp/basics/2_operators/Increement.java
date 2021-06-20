class Increement{
public static void main(String[] args)
{
int a=-5, b=2, res=0;
//print a and b
System.out.println("the values are "+a+" and "+b);
a++;
System.out.println("a++ operation makes a="+a);
++a;
System.out.println("++a operation makes a="+a);

res=(a++)+b;
System.out.println("the value of reult for (a++)+b is "+res);

res=++a+b;
System.out.println("the value of result for(++a)+b is "+res);
}
}