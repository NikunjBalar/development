package pattern;

public class Ex2 {
	/*
	 
 	*
   **
  * *
 *  *
*   *
 *  *
  * *
   **
    *
completed;
	 
	 */
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j == 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = n-1; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (j == 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
