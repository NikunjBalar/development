package aptiprogramme.StringProgramme;

public class DivisoinByTypeOfString {
	public static void main(String[] args) {
		DivisoinByTypeOfString ds=new DivisoinByTypeOfString();
		//ds.devision();
		ds.devisionByArray();
	}
	
	void devision() {
		String line="I Am Nikunj 132@-";
		char[] s=line.toCharArray();
		String s1= "";
		String s2= "";
		String s3= "";
		String s4= "";
		
		for (int i = 0; i < s.length; i++) {
			if (s[i]>=65 && s[i]<=90) {
				s1=s1+s[i];
			} 
			else if(s[i]>=97 && s[i]<=122){
				s2=s2+s[i];
			}
			else if(s[i]>=48 && s[i]<=57) {
				s3=s3+s[i];
			}
			else {
				s4=s4+s[i];
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
	void devisionByArray() {
		String line="I Am Nikunj 132@-";
		char[] s=line.toCharArray();
		
		char num[] = null;
		char upper[] = null;
		char lower[] = null;
		char special[] = null;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i]>=65 && s[i]<=90) {
				for (int j = 0; j < special.length; j++) {
					upper[j]+=s[i];
				}
			} 
			else if(s[i]>=97 && s[i]<=122){
				for (int j = 0; j < special.length; j++) {
					lower[j]+=s[i];
				}
			}
			else if(s[i]>=48 && s[i]<=57) {
				for (int j = 0; j < special.length; j++) {
					num[j]+=s[i];
				}
			}
			else {
				for (int j = 0; j < special.length; j++) {
					special[j]+=s[i];
				}
			}

		}
		for (int j = 0; j <upper.length; j++) {
			System.out.println(upper[j]);
		}
		for (int i = 0; i < special.length; i++) {
			System.out.println(lower);
		}
		for (int i = 0; i < special.length; i++) {
			System.out.println(num);
		}
		for (int i = 0; i < special.length; i++) {
			System.out.println(special);
		}
	}
}
