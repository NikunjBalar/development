class FindBook{
	
	int id;
	String name;
	double d;
	
	void writebook(){
		System.out.println("only read the book..");
	}	
	void writebook(Pen p){
		System.out.println("write by"+p.name+"pen \t price"+p.price);
	}
	void writebook(Pencil pe){
		System.out.println("write by "+pe.Name);
	}
}