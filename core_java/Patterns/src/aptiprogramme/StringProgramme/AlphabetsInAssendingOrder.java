package aptiprogramme.StringProgramme;

public class AlphabetsInAssendingOrder {
	String line="transformer";
	char[] ch=line.toCharArray();
	public static void main(String[] args) {
		AlphabetsInAssendingOrder ao=new AlphabetsInAssendingOrder();
		ao.assendingOrder();
		//ao.asciiAssendingOrder();
	}
	
	void assendingOrder() {

		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			System.out.print(ch[i]);
		}
	}
	
	/*void asciiAssendingOrder() {
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if ((ch[i]>65 && ch[i]<90) || (ch[i]>97 && ch[i]<)) {
					
				} else {

				}
			}
		}
	}*/
}
