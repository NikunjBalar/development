import java.util.*;

class PalindromExample{
	public static void main(String[] args){
		System.out.println("main method started........................");
		Scanner sc =new Scanner(System.in);
		int r,sum=0,temp,n;
		System.out.println("Enetr the number to chack palindrom or not ");
		n=sc.nextInt();
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
	if(temp==sum)
	System.out.println("Palindrome number............");
	else
	System.out.println("not Palindrome..");
	System.out.println("main method ended..................");
	}
}