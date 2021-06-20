import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args){
		System.out.println("main method started.... ");
		PrimeNumber pr=new PrimeNumber();
		pr.nikunj();
		System.out.println("main method ended.......");
	}
	
	void nikunj(){
		
		Scanner s=new Scanner(System.in); 
		PrimeNumber p=new PrimeNumber();
		System.out.println("1.prime number 2.sum of prime number");
		int opt=s.nextInt();
		
		switch(opt){
			
			case 1:
				p.nik();
				break;
				
			case 2:
				p.kunj();
		}
	}
	
	void nik(){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of primeNumber ...");
		int a=s.nextInt();
		
		for(int i=1;i<=a;i++){
			for (int j=1;j<=9;j++){
				
				if((i%j==0 || i%j==1) || i/j==00){
					System.out.print(i+"* ");
					
				}
				else{
					System.out.print(i+"  ");
					//break;
				}
			}
			System.out.println("");
		}
	}
	
	void kunj(){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of primeNumber....");
		int b=s.nextInt();
		int result=0;
		
		for(int i=0;i<=b;i++){
			for (int j=1;j<=9;j++){
				
				if(i%j==0){
					System.out.print("");
				}
				else{
					result+=i;
				}
			}
		}
		System.out.println("sum of prime series : "+result);
	}
}
