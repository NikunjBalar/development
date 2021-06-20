
class PrintNumber{
	public static void main(String[] args)
	{
		System.out.println("main method is start...");
		int a,b;
		Scanner s =new Scanner(System.in);
		System.out.println("value of a:");
		a=s.nextInt();
		System.out.println("value of b:");
		b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			System.out.println(i);		
		}	
	}
}