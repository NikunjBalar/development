package pattern;
import java.util.*;
public class StarePattern {
	/*
	  
	 ******* 
	  *****
	   ***
	    *
	   ***
	  *****
	 ******* 
	 
	 */ //complet;
	Scanner s =new Scanner(System.in);
	int raw=s.nextInt();
	int column=s.nextInt();
	public static void main(String[] args) {
		System.out.println("mms");
		
		StarePattern sp=new StarePattern();
		sp.xPluse();
		
		System.out.println("mme");
	}
	void xPluse() {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i<=j && i+j<=raw-1) || j<=i && i+j>=raw-1 || i==raw/2){
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
