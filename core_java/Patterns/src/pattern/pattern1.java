package pattern;

public class pattern1 {
	/*
	  
	 *
	 * *
	 *  *
	 *   *
	 *  *
	 * *
	 * 
	 
	 complet;
	 
	 */
	public static void main(String[] args) {
		pattern1 n=new pattern1();
		n.nik();
		n.kunj();
	}
	void nik() {
		int raw=7;
		int col=7;
		 for (int i = 0; i < raw; i++) {
			for (int j = 0; j < col; j++) {
				if ((i==j && j<=col/2) || (i+j==col-1 && j<col/2) || j==0) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------"); 
	}
	
	void kunj() {
		int raw=7;
		int col=4;
		for (int i = 0; i <raw; i++) {
			for (int j = 0; j < col; j++) {
				if (i==j || i+j==raw-1 || j==0) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}