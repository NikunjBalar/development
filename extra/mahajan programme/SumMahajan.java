import java.util.Scanner;

class SumMahajan{
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
			}
		}
		
		for (int i=0;i<r;i++){
			for ( int j=0;j<c;j++){
				if((i==j) || (i+j==(r-1))){
					diagonal+=a[i][j];
				}
				else if( j==0 && i!=0 && i!=(r-1) ){
					side+=a[i][j];
				}
				else if( i==0 && j!=0 && j!=(c-1) ){
					side+=a[i][j];
				}
				else if( j==4 && i!=0 && i!=(r-1) ){
					side+=a[i][j];
				}
				else if( i==4 && j!=0 && j!=(c-1) ){
					side+=a[i][j];
				}
				else {
					middel+=a[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println("sum of Diagonal element..: "+diagonal);
		System.out.println("sum of Side element...: "+side);
		System.out.println("sume of Middel element...:"+middel);
		System.out.println("main method ended..");
	}
}