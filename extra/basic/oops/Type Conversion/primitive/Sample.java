class Sample{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Sample s=new Sample();
		s.typeconversoin();
		
		System.out.println("main method ended..");
	}
	
	void typeconversoin(){
		int a=10;
		double b=a;
		System.out.println("a="+a+"\n b="+b);
		
		char ch='#';
		int num=ch;
		System.out.println("ch="+ch+"\n num="+num);
		
		int x=800;
		// byte y=x; error:
		byte y=(byte)x;
		System.out.println("x="+x+"\n y="+y);
		
		int s=100;
		byte d=(byte)s;
		System.out.println("s="+s+"\n d="+d);
		
		double Double=2131312434.41253465;
		//long Long=Double; erroe:
		long Long=(long)Double;
		System.out.println("Double="+Double+"\n Long="+Long);
		
	}
}