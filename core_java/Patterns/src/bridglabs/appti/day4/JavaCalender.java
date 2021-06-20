package bridglabs.appti.day4;

public class JavaCalender {
	static int dayofweek(int d, int m, int y) {
		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		y -= (m < 3) ? 1 : 0;
		return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d)%7;
	}

	// Driver Program to test above function
	public static void main(String arg[]) {
		int day = dayofweek(3, 1, 2020);
		
		System.out.println(day);
		if (day == 1) {
			System.out.println("monday");
		} else if (day == 2) {
			System.out.println("tuseday");
		} else if (day == 3) {
			System.out.println("wendesday");
		} else if (day == 4) {
			System.out.println("thursday");
		} else if (day == 5) {
			System.out.println("friday");
		} else if (day == 6) {
			System.out.println("saturday");
		} else {
			System.out.println("sunday lol holiday");
		}
	}

}
