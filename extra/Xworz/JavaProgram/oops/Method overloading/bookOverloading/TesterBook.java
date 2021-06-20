class TesterBook{
		public static void main(String[] args){
		
		Book b1 = new Book();
		b1.name="parasBook";
		b1.noOfPage= 500;
		b1.price=250;
		
		b1.gotowrite(b1);
		
		Pen p = new Pen();
			p.brandName="apsara";
			p.color="Red";
			p.price=50;
		b1.gotowrite(p);
		
		Pencil c = new Pencil();
			c.brandName="apsara";
			c.thickness="Red";
		
		b1.gotowrite(c);
		
		}
}