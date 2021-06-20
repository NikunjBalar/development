import java.util.Scanner;
class Number{
	public static void main(String[] ar){
		System.out.println("main method started... ");
		Number n=new Number();
		n.nikunj();
		n.nik();
		System.out.println("main method started... ");
	}
	/*
	1
	22
	333
	4444
	55555
	*/
	
	
	
	void nikunj(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter ending number..");
		int k=s.nextInt();
		for(int i=1;i<=k;i++){
			for(int j=1;j<=k;j++){
				if (i>=j){
					System.out.print(i);
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	
				//or
	
	void nik(){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of primeNumber ...");
		int a=s.nextInt();
		
		for(int i=1;i<=a;i++){
			for (int j=1;j<=9;j++){
				
				if(i/j!=0){
					System.out.print(i+" ");
					//break;
				}
				else{
					System.out.print("");
				}
			}
			System.out.println("");
		}
	}
	
}