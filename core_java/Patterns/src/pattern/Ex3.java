package pattern;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enetr the number");
		int num=s.nextInt();
		int raw=7;
		int colu=1;
		int mid=raw/2;
			for(int i=1;i<=num;i++){
				for(int j=1;j<=num;j++){
					if (j<=i) {
						System.out.print(j);
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("---------------------------------");
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if (j<=i) {
					System.out.print(j);
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		for(int i=1;i<=num;i++){
			for (int j=1;j<=9;j++){
				
				if(i/j!=0){
					System.out.print(j);
					//break;
				}
				else{
					System.out.print("");
				}
			}
			System.out.println("");
		}
		for (int i =num-1; i >0; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1;i<raw;i++){
			for (int j=1;j<=colu;j++){
				System.out.print(j);
				if (i<mid) {
					colu++;
				}
				else{
					colu--;
				}
			}
			System.out.println();
		}

	}
}