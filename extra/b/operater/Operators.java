class Operators{
	public static void main(String [] args){
		System.out.println("Main Method started..");
		int a=10,b=20,res=0,val=0;
		//RelationalOperator
		if(a>b){
			res=a;
		System.out.println("results="+res);
		}
		if(b>a){
		res=b;
		}
		System.out.println("results="+res);
		if(res==b){
			System.out.println("ther are same");
		}
		if(res!=a){
			System.out.println("ther are different");
		}
		
		boolean result=false;
		result=a>b;
		System.out.println(res);

		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
	}
}