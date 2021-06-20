import java.util.Scanner;

class FactorialMahajan{
	public static void main (String[] ar){
		System.out.println("mms............");
		Scanner s=new Scanner(System.in);
			System.out.println("1.singrl Num Factorial \t  2.Number of Factorial ");
			int opt=s.nextInt();
			FactorialMahajan m1=new FactorialMahajan();
			
			switch(opt){
				case 1:
					m1.display2();
					break;
				case 2:
					m1.display1();
			
			
			
			}
		System.out.println("mme............");
	}
	
	public void display1(){
		//	System.out.println("Method Called......");
			
			
		Scanner s=new Scanner(System.in);
		System.out.println("enter start number");
		int a=s.nextInt();
		System.out.println("enter ending number");
		int b=s.nextInt();
		int fact=1;
		
		for(int i=a;i<=b;i++){
			for(int j=1;j<=i;j++){
				fact=fact*j;
				
			}
			System.out.println(i +"Factorial : "+fact);
			fact=1;
		}
	}
	public void display2(){
		//	System.out.println("Method Called......");
			
			
		Scanner s=new Scanner(System.in);
		System.out.println("enter start number");
		int a=s.nextInt();
		//System.out.println("enter ending number");
		//int b=s.nextInt();
		int fact=1;
		int i;
		for(i=1;i<=a;i++){
				fact=fact*i;
				
			
		}
		System.out.println(a +" Factorial : "+fact);
			//fact=1;
	}
}