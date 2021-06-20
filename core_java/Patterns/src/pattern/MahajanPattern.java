package pattern;

import java.util.Scanner;

public class MahajanPattern {
	public static void main(String[] args) {
		
	
	System.out.println("main method started..");
	MahajanPattern TT=new MahajanPattern();
	TT.nik1();
	
	System.out.println("main method Ended");
	
	}
	
	void nik1() {	
		
		Scanner s=new Scanner(System.in);
		System.out.println("number of raw..:");
		int n=s.nextInt();
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				if (i==0 || j==0 || i==(n-1) || j==(n-1)) {
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
