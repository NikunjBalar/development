import java.util.Scanner;
class PrintEvenodd{
	public static void main(String[] args){
		System.out.println("main method started..");
		Scanner s=new Scanner(System.in);
		/*int [][] a={
			{1,2,3,4,5},
				{1,2,3,4,5},
					{1,2,3,4,5},
						{1,2,3,4,5},
							{1,2,3,4,5},
		}
		
		1 1 1 1 1
		1 - - - 1
		1 - 2 - 1
		1 - - - 1
		1 1 1 1 1
		
		
		*/
		int raw;
		int res=0;
		System.out.println("enter the number");
		raw=s.nextInt();
		
		for (int i=0;i<raw;i++){
			for (int j=0;j<raw;j++){
				if (i==0 || j==0 || i==(raw-1) || j==(raw-1)){
					System.out.print(" 1 ");
				}
				else if(i!=((raw-1)/2) || j!=((raw-1)/2)){
					System.out.print(" - ");
				}
				else {
					res=i-1;
					System.out.print(" "+res+" ");
				}
			}
			System.out.println(" ");
		}
		
		
		System.out.println("main method ended..");
	}
}