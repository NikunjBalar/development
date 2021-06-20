package aptiprogramme.OtherAptiProgramme;

public class PrintNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if (i%3==0 && i%5==0){
				System.out.println("divisible by 3&5..:"+i);
			}
			else if (i%3==0 ) {
				System.out.println("divisible by 3..:"+i);
			}
			else if(i%5==0 ){
				System.out.println("divisible by 5..:"+i);
			}
			
		}
	}
}
