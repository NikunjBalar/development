class Operators{
	public static void main(String[] args){
		int a=10, b=20, res =0, valus=0;
		
		if(a>b){
			res= a;
		}
	
		if(b>a){
			res= b;
		}
		System.out.println("Result ="+res);
	
		if(res==b){
			System.out.println("they are same");
		}
		if(res!=a){
			System.out.println("they are different");
		}
		boolean result = false;
		result = a>b;
		System.out.println(res);

		System.out.println(a>b);					
		System.out.println(a<b);
		System.out.println(a=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
	}
}