class Tester{
	public static void main(String [] args){
		System.out.println("main method started..");
		FindBook f=new FindBook();
		f.name="java";
		
		Book a =new Book();
			a.bookName="JAVA B";
			a.NumberofPages=4563;
			a.price=3456.2365;
			
		Pen p=new Pen();
			p.name="nataraj";
			p.price=10;
			p.coloure="red";
		
		Pencil pe=new Pencil();
			pe.Name="apsara";
			pe.thikness=0.22;
			pe.price=4.5;
			
		System.out.println(a);
		System.out.println(p);
		System.out.println(pe);
		//f.writebook(a);
		f.writebook(p);
		f.writebook(pe);
	}
}