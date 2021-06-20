import java.util.Scanner;

class SimpleTwoDarry{
	public static void main(String [] args){
		System.out.println("main method started..");
		
		int [][] twoDarry=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arry elements....");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				twoDarry[i][j] =sc.nextInt();
			}
		}
		System.out.println("\n arry elements are ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(twoDarry[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("main method ended..");
	}
} 