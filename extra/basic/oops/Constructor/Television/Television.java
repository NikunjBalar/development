class Television{
	String brandName;
	int size;
	double price;
	
	Television(){
		System.out.println("Default constructer..");
	}
	
	Television(String bn,int s,double pr){
		System.out.println("user define constructer");
		brandName=bn;
		size=s;
		price=pr;
	}
}