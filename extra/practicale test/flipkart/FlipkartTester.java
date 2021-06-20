class FlipkartTester{
	public static void main(String [] args){
		System.out.println("main method started..");
		Flipkart f=new Flipkart();
			f.name="shopping";
		
		Book b=new Book();
			b.Name="Flip";
			b.WriterName="nikunj";
			b.price=450;
			b.NoofPages=675;

		Mobile m=new Mobile();
			m.Mobilename="vivo";
			m.ModelNum="v7+";
			m.NumofCamera=2;
			m.price=22000;
			m.colorofPhone='b';
			
		Leptop l=new Leptop();
			l.CompanyName="Dell";
			l.ModelName="Inspiron";
			l.modelNum="64-bit";
			l.price=32000;
			
		f.sell(b);
		f.sell(m);
		f.sell(l);
	}
}