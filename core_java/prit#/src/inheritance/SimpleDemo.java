package inheritance;

public class SimpleDemo {
	public static void main(String[] args) {
		SimpleDemo2 d2=new SimpleDemo2();
		System.out.println(d2.x);
		System.out.println(d2.y);
		d2.disp();
		d2.test();
	}
}

class SimpleDemo1 {
	static int x = 25;

	void test() {
		System.out.println("test mwthod run...");
	}

}

class SimpleDemo2 extends SimpleDemo1 {
	int y = 55;

	void disp() {
		System.out.println("disp mwthod run...");
	}

}