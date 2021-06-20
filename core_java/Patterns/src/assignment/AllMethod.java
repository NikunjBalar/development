package assignment;

public class AllMethod {
	public static void main(String[] args) {
		Override o=new Override();
		o.division();
		o.division(34);
	}
}
class Constructor{
	int i=10;
	int j=20;
	Constructor(){
		System.out.println("constructor");
	}
}

class Method{
	
	void division() {
		System.out.println("method.....");
	}
	void division(int a) {
		System.out.println("method overloading.......");
	}
}

class Override extends Method {
	void division() {
		System.out.println("method overridden...");
	}
}