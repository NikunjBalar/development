import java.util.*;
class ArryOddEven{
	public static void main(String[] args){
		System.out.println("main method started.....");
		int evensum=0,oddsum=0,i;
		
		for(i=0;i<=20;i++){
			
			if(i%2==0)
			evensum = evensum+i;
			else
			oddsum=oddsum+i;
		}
		System.out.println("Even number sum"+evensum);
		System.out.println("Odd number sum"+oddsum);
		System.out.println("main method ended...");
	}
}