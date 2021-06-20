import java.util.Scanner;

class SumOfDiagonalIndex{
	public static void main (String [] args){
		System.out.println("main method started..");
		int[][] twoDarry=new int[4][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arry element.=");
		for (int i=0;i<4;i++){
			for(int k=0;k<4;k++){
				twoDarry[i][k]=sc.nextInt();
			}	
		}	
		for (int i=0;i<4;i++){
			for(int k=0;k<4;k++){
				System.out.print(twoDarry[i][k]+"\t");
			}
			System.out.println(" ");
		}	
		int res=0;
		for (int i=0;i<4;i++){
			for(int k=0;k<4;k++){
				if (twoDarry[i]==twoDarry[k]){
					res+=twoDarry[i][k];
				System.out.println(res);
				}
				else{
				System.out.println();
				}
			}
		}	
		System.out.println(res);
		System.out.println("main method ended.");
	}	
}