package aptiprogramme.StringProgramme;
import java.util.*;
//complet;
public class NikunjStringMahajan {
	Scanner s=new Scanner(System.in);
	String line=s.nextLine();
	char[] ch=line.toCharArray();
	
	public static void main(String[] args) {
		NikunjStringMahajan nw=new NikunjStringMahajan();
		nw.numOfWord();
		nw.upperCase();
	}
	
	void upperCase() {
		for (int i = 0; i < ch.length; i++) {
			if (97<=ch[0] && ch[0]<=122) {
				ch[i] =(char) (ch[i]-32);
			}
			else if(ch[i]==' ') {
				if (ch[i+1]==' ') {
					continue;
				}
				else if(97<=ch[i+1] && ch[i+1]<=122){
					ch[i+1]=(char) (ch[i+1]-32);
				}
			}
			System.out.print(ch[i]);
		}
	}
	
	
	void numOfWord() {
		int count=1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]==' ') {
				if (ch[i+1]==' ') {
					continue;
				}
				else {
					count+=1;
				}
			}
		}
		System.out.println(count);
	}
}
