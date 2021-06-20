class FlipkartTester{
	public static void main(String[] args){
		Flipkart f = new Flipkart();
		
		
		Book b = new Book();
		b.bookName = "MF-12";
		b.noOfPage = 421;
		
		f.sell(b);
		
		Mobile m = new Mobile();
		m.brandName = "Apple";
		m.price = 42100;
		f.sell(m);
		
		
		Leptop l = new Leptop();
		l.brandName = "lenovo";
		l.modelNumber = "amd a9";
		f.sell(l);
		
	}
}

