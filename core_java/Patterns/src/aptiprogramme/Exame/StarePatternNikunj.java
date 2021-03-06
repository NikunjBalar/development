package aptiprogramme.Exame;
import java.util.*;

public class StarePatternNikunj {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		StarePatternNikunj sp=new StarePatternNikunj();
		if(n<7) {
			sp.cross(n);
		}
		else {
			sp.crossPlus(n);
		}
	}
	
	void cross(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				if(i==j || i+j==n-1) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	void crossPlus(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				if(i==n/2 || j==n/2 ||i==j || i+j==n-1) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}