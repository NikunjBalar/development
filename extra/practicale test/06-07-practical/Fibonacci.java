import java.util.Scanner;

class Fibonacci{
	public static void main(String[] ar){
		System.out.println("main method started..");
		Fibonacci f=new Fibonacci();
		f.nikunj();
		System.out.println("main method ended....");
	}
	
	void nikunj(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the last number ");
		int n=s.nextInt();
		
		int a=0;
		int b=0;
		int c=1;
		
		for(int i=0;i<=n;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
			
		}
	}
}