package pattern;
import java.util.Scanner;

public class TwoByTwoMatrix {
	/*
	 
	 
 *  @  @  @  * 
 @  *  -  *  @ 
 @  -  *  -  @ 
 @  *  -  *  @ 
 *  @  @  @  * 

completed;
	 */

	public static void main(String[] args) {
		System.out.println("main method started..");
		TwoByTwoMatrix TT=new TwoByTwoMatrix();
		TT.nik();
		
		System.out.println("main method Ended");
	}
	
	void nik() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("number of raw..:");
		int raw=s.nextInt();
		int column=raw;
		
		for (int i = 0; i <raw; i++) {
			for (int j = 0; j <column; j++) {
				if (i==j || i+j==(raw-1)) {
					System.out.print(" * ");
				}
				else if (i==0 || j==0 || i==(raw-1) || j==(column-1)) {
					System.out.print(" @ ");
				}
				else {
					System.out.print(" - ");
				}
			}
			System.out.println("");
		}
	
	}
}
