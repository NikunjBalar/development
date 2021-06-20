package aptiprogramme.StringProgramme;
import java.util.Scanner;

public class StringToChar {
	public static void main(String[] args) {
		System.out.println("mms");
		StringToChar sc=new StringToChar();
		sc.Reversed();
		System.out.println("mme");
	}
	void Reversed() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter String line ");
		String name=s.nextLine();
		String reversed="";
		
		char[] ch=name.toCharArray();
		
		for (int i = ch.length-1; i >=0; i--) {
			reversed+=ch[i];
		}
		System.out.println(name);
		System.out.println(reversed);
		
		if (name.equals(reversed)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}
	}
}
