class BasicMath{
	double findSum(int a ,double b)
	{
	double res;
		res=a+b;
		System.out.println("sum of the a and b is :"+res);
	return res;
	}
	
	int findSquare(int n)
	{
		int square= n*n;
		System.out.println("square of n is :"+square);
		return square;
	}
	
	int findCube(int m)
	{
		int cube=m*m*m;
		System.out.println("Cube of m is :"+cube);
		return cube;
	}
	
	double findSimpleInterest(double p,int t,double r)
	{
		double SI=(p*t*r)/100;
		System.out.println("Simple interest is :"+SI);
		return SI;
	}
	
	double findPercentage(double[] marks)
	{
	int max=600;
    double res1=0;
	for(int i=0;i<marks.length;i++)
		{
			res1=res1+marks[i];
		}
		double d = (res1*100)/max;
		System.out.println("percentage is .............................."+d);
	return (d);
	}
	
}