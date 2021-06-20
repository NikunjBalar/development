package aptiprogramme.StringProgramme;

public class PasswordValidation {
	public static void main(String[] args) {
		PasswordValidation p = new PasswordValidation();
		p.password();
		// p.password1();
	}

	void password() {
		// boolean invalid=false;
		int upper = 0;
		int lower = 0;
		int num = 0;
		int special = 0;
		String line = "Nikunj123@";
		char[] c = line.toCharArray();
		if (c.length >= 8 && c.length <= 16) {
			for (int i = 0; i < c.length; i++) {
				if (c[i] >= 65 && c[i] <= 90) {
					upper++;
				} else if (c[i] >= 97 && c[i] <= 122) {
					lower++;
				} else if (c[i] >= 48 && c[i] <= 57) {
					num++;
				} else {
					special++;
				}
			}
			if (upper > 0 && lower > 0 && num > 0 && special > 0) {
				System.out.println("Strong password");
			} else {
				System.out.println("week password");

			}
		} else {
			System.out.println("week password");
		}
	}

	void password1() {
		// boolean =false;
		String line = "Nikunj123";
		char[] c = line.toCharArray();
		if (c.length >= 8 && c.length <= 16) {
			for (int i = 0; i < c.length; i++) {
				if (c[i] >= 65 && c[i] <= 90) {
					break;
				}
				if (c[i] >= 97 && c[i] <= 122) {
					break;
				}
				if (c[i] >= 48 && c[i] <= 57) {
					break;
				}
				// invalid=true;
				System.out.println("Strong password");
			}
		} else {
			System.out.println("week password");
		}
	}
}
