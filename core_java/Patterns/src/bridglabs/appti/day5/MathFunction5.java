package bridglabs.appti.day5;

public class MathFunction5 {

	static double computeIntrest(double c, float r, int t) {
		double amount = 1;
		double interest=1;
		//int n=t/12;
		for (int i = 1; i <= t; i++) {

			 interest *=(1 + r/100);
		}
		System.out.println(interest);
		amount = c+interest;
		System.out.println(amount);
		return amount;
	}

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("enter the amount");
		double c = s.nextDouble();
		System.out.println("Enter interest per period");
		float r = s.nextFloat();
		System.out.println("Enter period in month");
		int t = s.nextInt();
*/
		double c=1000;
		float r=10;
		int t=12;
		System.out.println(computeIntrest(c, r, t));

	}
}
