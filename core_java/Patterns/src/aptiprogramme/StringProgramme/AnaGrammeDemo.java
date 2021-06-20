package aptiprogramme.StringProgramme;

public class AnaGrammeDemo {
	public static void main(String[] args) {
		AnaGrammeDemo ad=new AnaGrammeDemo();
		ad.anaGrame();
	}
	void anaGrame() {
		String s1="nikunj";
		String s2="knuij";
		int count=0;
		if(s1.length()==s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						count++;
						break;
					}
					else {
						System.out.print("String is not anagrame");
					}
				}
			}
			System.out.println(count);

			System.out.println("String is anagrame");
		}
		else {
			System.out.println("String is not anagrame");
		}
	}
}
