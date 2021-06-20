import java.util.*;

class NumberOfElementInString{
	public static void main(String[] ar){
		System.out.println("main method started..");
		
		NumberOfElementInString n1=new NumberOfElementInString();
		n1.String1();
		
		System.out.println("main method started..");
	}
	
	public  void String1(){
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter string line");
		String nikunj=s.nextLine();
		//String nikunj = "This Is Test";
		char[] sTCA = nikunj.toCharArray();
 
		for(int i=0;i<=nikunj.length;i++){
			char ch=nikunj.charAt(i);
			if(sTCA=='a' || sTCA=='e' || sTCA=='i' || sTCA=='o' || sTCA=='u' ){
				System.out.println(" "+sTCA);
			
			}
		}
	}
}