package pattern;

public class Jalebi {
	public static void main(String[] args) {
		
		int count=01;
		for (int i = 00; i < 5; i++) {
			for (int j = 00; j < 5; j++) {
				if (i==0) {
					System.out.print("  "+count);
				}
				else if (j==4) {
					System.out.print(" "+count);
				}
				else if (i==4) {
					System.out.print(" "+count);
				}
				else {
					System.out.print(" "+count);
				}
				count++;
			}
			System.out.println();
		}
	}
}
