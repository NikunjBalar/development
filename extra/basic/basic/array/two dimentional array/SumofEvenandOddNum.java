import java.util.Scanner;

class SumofEvenandOddNum{
	public static void main(String [] args){
		System.out.println("main method started..");
		int [][] twoDarry=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arry element..");
		for(int k=0;k<3;k++){
			for (int l=0;l<3;l++){
				twoDarry[k][l]=sc.nextInt();
			}
		}
		for (int k=0;k<3;k++){
			for(int l=0;l<3;l++){
				System.out.print(twoDarry[k][l]+"\t");
			}
			System.out.println(" ");
		}
		int even=0;
		int odd=0;
		for (int k=0;k<3;k++){
			for(int l=0;l<3;l++){
				if (twoDarry[k][l]%2==0){
				even+=twoDarry[k][l];
				}
				else{
					odd+=twoDarry[k][l];
				}
			}	
		}	
			System.out.println(even);
			System.out.println(odd);
	}
}
