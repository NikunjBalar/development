import java.util.Scanner;

class SumMahajanIfinIf{
	public static void main(String[] ar){
		
		System.out.println("main method started..");
		int r,c;
		int diagonal=0;
		int side=0;
		int middel=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of raw");
		r=sc.nextInt();
		System.out.println("Enter number of column");
		c=sc.nextInt();
		int[][] a=new int[r][c];
		System.out.println("Enter array element");
		
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
				//System.out.println(" ! ");
			}
		}
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				if((i==j) || (i+j==4)){
					//diagonal+=a[i][j];
					System.out.print(" @ ");
				}
				else if (i!=0 && i!=4){
					if (j==0 || j==4){
						//side+=a[i][j];
						System.out.print(" # ");
					}
				}
				else if (j!=0 && j!=4){
					if (i==0 || i==4){
						//side+=a[i][j];
						System.out.print(" # ");
					}
				}
				else {
					//middel+=a[i][j];
					System.out.print(" $ ");
				}
			}
			System.out.println("");
		}
		//System.out.println("sum of Diagonal element..: "+diagonal);
		//System.out.println("sum of Side element...: "+side);
		//System.out.println("sume of Middel element...:"+middel);
		//System.out.println("main method ended..");
	}
}