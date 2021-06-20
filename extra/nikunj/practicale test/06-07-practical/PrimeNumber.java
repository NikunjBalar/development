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
		int count=0;
		int i;
		
		for(i=2;i<a;i++){	
			if(a%i==0){
				count++;
			}
		}
		if(count==0){
			System.out.print(i+"it is a prime number");
		}
			System.out.println("");
	}
	
	void kunj(){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of primeNumber....");
		int b=s.nextInt();
		int sum=0;
		int result;
		for(int i=1;i<=b;i++){
					result=0;
		
			for (int j=2;j<i;j++){
				
				if(i%j==0){
					result++;
				}
			}
			if(result==0){
				sum+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n"+sum);
	}
}
