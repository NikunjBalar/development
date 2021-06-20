package pattern;
import java.util.*;

public class Pattern2 {
	
	/*
	   *           *
	  ***         ***
	 *****       * * *
	            *******
	 *****       * * *
	  ***         ***
	   *           *
	   
	   
	   
	   
	 */
	Scanner s=new Scanner(System.in);
	int raw=s.nextInt();
	int column=s.nextInt();
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Pattern2 p=new Pattern2();
		p.pat();
		p.sunil();
		p.diamond();
		
		System.out.println("main method ended");
	}
	void pat() {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((j==i && i>=raw/2)|| (i+j==raw-1 && i>=raw/2) || i==raw-1 || (j==column/2 && i>=raw/2)) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((j==i && i<=raw/2) || ( i+j==raw-1 && i<=raw/2) || (j==column/2 && i<=raw/2)) {
					System.out.print(" *");
				} 
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------");
		
		
	}
	void sunil() {
	int star=1;
	
		for (int i = 1; i < raw; i++) {
			for (int j = raw-1; j>=i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(" *");
			}
			star+=2;
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------");
	}
	void diamond() {
		int star=1;
		int mid=raw/2;
		int space=raw-1;
		
		
		for (int i = 1; i <=raw; i++) {
			for (int j = 1; j <space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(" *");
			}
			if (i<=mid) {
				space--;
				star+=2;
			} else {
				space++;
				star-=2;
			}
			System.out.println();
		}
	}
}
