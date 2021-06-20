package pattern;

public class PrintPattern {
	public static void main(String[] args) {
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for (int k = 0; k <4; k++) {
			for (int j = 0; j <4; j++) {
				System.out.print((k+1)+" ");
			}
			System.out.println();
		}
	}

}
