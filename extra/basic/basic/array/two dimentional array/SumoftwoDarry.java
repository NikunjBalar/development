import java.util.Scanner;

class SumoftwoDarry{
	public static void main(String []args){
		System.out.println("main method started...");
		int [][] twoDarry=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arry element..");
		for (int i=0; i<2;i++){
			for (int j=0; j<2; j++){
				twoDarry[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n arry output");
		for(int i=0; i<2;i++){
			for (int j=0; j<2; j++){
				System.out.print(twoDarry[i][j]+"\t");
			}
		System.out.println(" ");
		}
		int res=0;
		for (int i=0; i<2; i++){
			for (int j=0; j<2; j++){
				res+=twoDarry[i][j];
				System.out.println(res+"twoDarry[i][j]++");
			}
		}
		System.out.println("main method ended...");
	}
}