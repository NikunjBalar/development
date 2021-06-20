class TesterMarks
{
	public static void main(String[] args)
	{
		CalculaterMarks c = new CalculaterMarks();
		double res = c.findPercentage(50,60,70,80,'b');
		double res1 = c.findPercentage(35,40,50,45,70,55,60,50);
		System.out.println(res);
		System.out.println(res1);
	}

}