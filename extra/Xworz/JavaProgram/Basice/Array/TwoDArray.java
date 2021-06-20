import java.util.*;
class TwoDArray{
	public static void main(String[] args){
		System.out.println("main method start;..........");
		
		int[][] twoDArray = new int[2][3];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array elememts");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				twoDArray[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n array elememts are");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(twoDArray[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("main method ended.........");
	}
}