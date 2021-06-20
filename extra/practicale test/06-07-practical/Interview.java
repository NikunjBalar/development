import java.util.Scanner;

class Interview{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Interview f=new Interview();
		f.Fibbonasi();
		
		System.out.println("main method ended...");
	}
	
	void Fibbonasi(){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Fibbonasi number..");
		int n=s.nextInt();
		int count=0;
		int a=0;
		int b=0;
		int c=1;
		
		for(int i=0;i<=n;i++){
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+c);
			if(c%3==0){
				count+=c;
			}
		}
		System.out.println(" "+count);
	}
}
