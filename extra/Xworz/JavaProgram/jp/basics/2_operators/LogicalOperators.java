class LogicalOperators{
public static void main(String[] args)
 {
System.out.println("the main method has started bitch.\n\n");
	boolean andres,orres;
	int a=10, b=20;
System.out.print("the two values i've taken are a="+a);System.out.println(" and b="+b);
	
	andres=(a==b)&&(b==a);
	orres=(a==b)||(b==a);

	System.out.println("\nfor false and false expressions");
	System.out.println("the result for logical AND operation  is " +andres);
	System.out.println("the result for the logical OR operation is " +orres);

	andres=(a<b)&&(b==a);
	orres=(a<b)||(b==a);
	
	System.out.println("\nfor true and false expressions");
	System.out.println("the result for logical AND operation  is " +andres);
	System.out.println("the result for the logical OR operation is " +orres);

	andres=(b<a)&&(a<b);
	orres=(b<a)||(a<b);

	System.out.println("\nfor false and true expressions");
	System.out.println("the result for logical AND operation is " +andres);
	System.out.println("the result for the logical OR operation is " +orres);

	andres=(a<b)&&(b>=a);
	orres=(a<=b)||(b>a);

	System.out.println("\nfor true and true expressions");
	System.out.println("the result for logical AND operation  is " +andres);
	System.out.println("the result for the logical OR operation is " +orres);

System.out.println("\n\nthe main method has ended bitch.");

 }
}