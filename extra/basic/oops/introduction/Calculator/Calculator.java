class Calculator{
	int a;
	int b;
	
	void calculateSum(){
		int res=a+b;
		System.out.println(res);
	}
	int findSum(int x,int y){
		int res=x+y;
		System.out.println(res);
		return(+res);
	}
}