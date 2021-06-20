package aptiprogramme.Exame;

import java.util.*;

public class PassWordValidationWithBoolean {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String line=s.nextLine();
		char[] ch=line.toCharArray();
		
		isLengthcorrect(ch);
		isValid(ch);
		
	}
	
	static boolean isLengthcorrect(char[] ch) {
		if(ch.length>8 && ch.length<16) {
			
			return true;
		}
		return false;
	}
	
	static boolean isValid(char[] ch) {
		if(isLengthcorrect) {
			
		}
		
		
		return false;
	}
}
