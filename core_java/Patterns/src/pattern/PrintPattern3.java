package pattern;
import java.util.Scanner;
public class PrintPattern3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int raw;
		int column;
		System.out.println("enter number of raw..:");
		raw=s.nextInt();
		column=raw;
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if(i==0 || i==(raw-1) || j==0 || j==(column-1) || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
