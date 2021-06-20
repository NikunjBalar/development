class practice{
	public static void main(String [] args){
		int a=10;
		double b=12324.63452;
		float c=12.54f;
		byte d=127;
		String ename="nikunj";
		char f='m';
		boolean g=true,res2;
		double res=0;
		String res1;

		System.out.println(a+"\t"+b);
		res=a+(b+c);
		System.out.println("a+b+c="+res);

		res1=ename+f;
		System.out.println("full name="+res);

		res2=g;
		System.out.println("boolean="+res);

		res=a+(b+(c+d));
		System.out.println("a+b+c+d="+res);

		res=a&d;
		System.out.println("a&d="+res);

		res=++a+b;
		System.out.println("++a+b="+res);

		res=(a++)+b;
		System.out.println("(a++)+b="+res);
			
	}
}