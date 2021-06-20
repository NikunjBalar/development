class Flipkart{
	int id;
	String name;
	long imiNum;
	
	void sell(Book b){
		System.out.println(b.Name+"\t"+b.WriterName+"\t"+b.price+"\t"+b.NoofPages);
	}
	
	void sell(Mobile m){
		System.out.println(m.Mobilename+"\t"+m.ModelNum+"\t"+m.NumofCamera+"\t"+m.price+"\t"+m.colorofPhone);
	}
	
	void sell (Leptop l){
		System.out.println(l.CompanyName+"\t"+l.ModelName+"\t"+l.modelNum+"\t"+l.price);
	}
}