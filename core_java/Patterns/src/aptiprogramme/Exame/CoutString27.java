package aptiprogramme.Exame;

import java.util.*;

public class CoutString27 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter String..");
		String line=s.nextLine();
		/*System.out.println("enter onr character yoy want");
		char a=s.next().charAt(0);
		*/
		
		char[] ch=line.toCharArray();
		CoutString27 c=new CoutString27();
		c.count( line,ch);
	}
	
	void count(String line,char[] ch) {
		char temp;
		int count=0;
		int i;
		
		for ( i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i]==32) {
					break;
				}
				else if(ch[i]>ch[i+1]) {
					temp=ch[i+1];
					ch[i+1]=ch[i];
					ch[i]=temp;
				}
			}
			System.out.println(ch[i]+" " +count);
			count=0;
		}
/*		System.out.println(ch[i]+count);
*/	}
}