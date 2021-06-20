class BasicMath{
	double findSum(int a,double b){
		double res;
		res=a+b;
		System.out.println("sum of a and b="+res);
	return res;
	}
	int findSquare(int m){
		int Squre=m*m;
		System.out.println("Square of m="+Squre);
	return Squre;
	}
	int findCube(int n){
		int Cube=n*n*n;
		System.out.println("cube of n="+Cube);
	return Cube;
	}
	double findSimpleInterest(double p,double t,double r){
		double Interest=(p*t*r)/100;
		System.out.println("simple interest="+Interest);
	return Interest;
	}
	double findPercentage(double [] markes){
		
		int i;
		int max=400;
		double sum=0;
		for (i=0;i<markes.length;i++){
			sum+=markes[i];
		}
		double per=sum*100/max;
		return (per);
		//System.out.println("Percentage="+percentage);
	//return Percentage;
	}
}