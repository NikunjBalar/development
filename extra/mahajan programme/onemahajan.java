import java.util.Scanner;

class onemahajan{
	public static void main(String []args){
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.simple 2.different");
		int opt=sc.nextInt();
		Simple s=new Simple();
		int j=0;
		
		switch (opt){
			case 1:
				s.simple1();
				//for(int i=1;i<100;i++)
			//System.out.println(i+1);
			break;
			
			case 2:
				s.different2();
			/*for (int i=0;i<10;i++){
				for(j=0;j<10;j++){
					//System.out.print(i+(j+1));
					//System.out.println(j+1);
					
					//System.out.print(i+j);
					System.out.print(i);
					System.out.print(j);
				//System.out.print((i+1)+(j+1));
					System.out.print(" ");
				}
				
				//System.out.print(i);
				System.out.println(" ");
			}*/
		}
		System.out.println("main method ended");
	}
}