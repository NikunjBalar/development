package pattern;

public class Ex1 {
	/*
	 
	 *   
	 **  
	 * * 
	 *  *
	 * * 
	 **  
	 *   

	 completed;
	 */

	public static void main(String[] args) {
		int num=4;
//		int num=n/2;
		/*if (num%2==0) {
			System.out.println("-----");
			num=num/2;
			System.out.println(num);
		}else {
			num=(num/2)+1;
		}*/
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num; j++) {
				if (i==j||j==1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = num-1; i >=1; i--) {
			for (int j = 1; j <=num; j++) {
				if (i==j||j==1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}
