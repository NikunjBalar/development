package aptiprogramme.Exame;
import java.util.*;

public class PasswordValidation2 {
	Scanner s=new Scanner(System.in);
	String line=s.nextLine();
	public static void main(String[] args) {
		PasswordValidation2 pv=new PasswordValidation2();
		pv.CorrectPassword();
	}

	void CorrectPassword() {
		int number=0;
		int uppercase=0;
		int lowercase=0;
		int special=0;
		
		char[] ch=line.toCharArray();
		if(ch.length>=8 && ch.length<=16) {
			for (int i = 0; i < ch.length; i++) {
				if(ch[i]==32) {
					System.out.println("password shoud not contain space");
				}
				else if(i<ch.length-2) {
					if(ch[i]>=65 && ch[i]<=90) {
						if(ch[i+1]>=65 && ch[i+1]<=90) {
							if (ch[i+2]>=65 && ch[i+2]<=90) {
								System.out.println("password is up 1 invalid");
							}
							else {
								uppercase++;
							}
						}
						else {
							uppercase++;
						}
					}
					else if(ch[i]>=97 && ch[i]<=122) {
						if(ch[i+1]>=97 && ch[i+1]<=122) {
							if(ch[i+2]>=97 && ch[i+2]<=122) {
								System.out.println("password is l1 invelid");
							}
							else {
								lowercase++;
							}
						}
						else {
							lowercase++;
						}
					}
					else if(ch[i]>=48 && ch[i]<=57) {
						if(ch[i+1]>=48 && ch[i+1]<=57) {
							if (ch[i+2]>=48 && ch[i+2]<=57) {
								System.out.println("password is n1 invelid");
							}
							else {
								number++;
							}
						}
						else {
							number++;
						}
					}
					else if(ch[i]!=32) {
						if(ch[i+1]!=32) {
							if((ch[i+2]>=48 && ch[i+2]<=57) || (ch[i+2]>=97 && ch[i+2]<=122) || (ch[i+2]>=65 && ch[i+2]<=90)){
								special++;
							}
							else {
								System.out.println("password is s1 invelid");
							}
						}
						else {
							special++;
						}
					}
				}
				else {
					if(ch[i]>=65 && ch[i]<=90) {
						uppercase++;
					}
					else if(ch[i]>=97 && ch[i]<=122) {
						lowercase++;
					}
					else if(ch[i]>=48 && ch[i]<=57) {
						number++;
					}
					else if(ch[i]!=32) {
						special++;
					}
				}
			}
			if(uppercase>0 && lowercase>0 && number>0 && special>0) {
				System.out.println("password is valid");
			}
			else {
				System.out.println("password is not valid");
			}
		}
		else {
			System.out.println("lenth of password is not correct");
		}
	}
}
