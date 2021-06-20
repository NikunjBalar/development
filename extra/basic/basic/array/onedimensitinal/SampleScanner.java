import java.util.Scanner;

class SampleScanner{
	public static void main(String [] args){
		double [] markes=new double[8];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<markes.length; i++){
			System.out.println("Enter element "+i);
			markes[i]=sc.nextDouble();
		}
		for(int i=0;i<markes.length; i++){
			System.out.println(markes[i]);
		}
	}
}