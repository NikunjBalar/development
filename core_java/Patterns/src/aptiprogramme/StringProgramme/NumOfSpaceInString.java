package aptiprogramme.StringProgramme;
import java.util.Scanner;
//complet;
public class NumOfSpaceInString {
	public static void main(String[] args) {
		System.out.println("mms");
		
		NumOfSpaceInString nss=new NumOfSpaceInString();
		nss.NumSpace();
		System.out.println("mme");
	}
	void NumSpace() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter string line");
		String line=s.nextLine();
		//String reverse="";
		//char n=s.next().charAt(0);
		int space=0;
		int swer=0;
		int Num=0;
		int constant=0;
		int other=0;
		
		char[] ch=line.toCharArray();
		
		for (int i =0 ; i < ch.length; i++) {
			
			if(ch[i]==32) {
				space++;
			}
			else if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
					ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				swer++;
			}
			else if((ch[i]>=65 && ch[i]>=90) || (ch[i]>=97 && ch[i]>=122)) {
				constant++;
			}
			else if (ch[i]>=48 && ch[i]<=57) {
				Num++;
			}
			else {
				other++;
			}
		}
		System.out.println("Number of Space..:"+space);
		System.out.println("number of swer...:"+swer);
		System.out.println("Number of numeric..:"+Num);
		System.out.println("Number of constant..:"+constant);
		System.out.println("Number of other...:"+other);
	}

}
