package aptiprogramme.Exame;

public class PrimeNumber {
	public static void main(String[] args) {
		prime();
	}

	public static void prime() {
		int n = 2;
		int p;

		int m = n / 2;
		for (int j = 1; j <= 20; j++) {
			p=0;
			if (j % 2 == 0) {
				System.out.println(j+" not prime number");
			}

			else if (j != 0 && j != 1) {
				for (int i = 2; i < j; i++) {
					if (j % i == 0) {
						p++;
					}
				}
				if (p == 0)
					System.out.println(j+" prime number");
			}
		}
	}
}
