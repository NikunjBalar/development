package overloading;

class P {
	int x = 5;
}

class S extends P {
	int x = 10;
	
	public S(int x) {
		System.out.println(this.x);
		System.out.println(super.x);
	}
	

}

public class Main {
	public static void main(String[] args) {
		
//		P p=new P();
		S s=new S(11);
//		System.out.println(s.x);
//		System.out.println(super.s.x);
	}

}
