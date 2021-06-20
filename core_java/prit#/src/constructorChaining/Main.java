package constructorChaining;

class Demo1{
	int x=2;
	double y=1;
	
	public Demo1() {
		this(12);
		System.out.println("running demo1.... - int");
//		this.x=x;
	}
	public Demo1(int x) {
		this(12.11);
		System.out.println("running demo1.... - int "+x);
//		this.x=x;
	}
	public Demo1(double y) {
//		this(12);
		System.out.println("running demo1....- double "+y);
		this.y=y;
	}
	void print() {
		System.out.println("x : "+this.x);
		System.out.println("y : "+y);
	}

}


public class Main {
	public static void main(String[] args) {
		Demo1 demo1=new Demo1(1);
		demo1.print();
	}
}
