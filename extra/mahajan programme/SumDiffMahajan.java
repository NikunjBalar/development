import java.util.Scanner;

class SumDiffMahajan{
	public static void main(String[] ar){
		System.out.println("main methed started..");
		int r,c;
		int diff=0;
		int diagonal=0;
		int side=0;
		int res=0;
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
		/*int[][] a={
			{1,2,3,4,5},
				{1,2,3,4,5},
					{1,2,3,4,5},
						{1,2,3,4,5},
							{1,2,3,4,5}
		};*/
		for (int i=0;i<r;i++){
			for ( int j=0;j<c;j++){
				if((i==j) || (i+j==(r-1))){
					diagonal+=a[i][j];
					//System.out.print(" # ");
				}
				else if ((i==((r-1)/2)) || (j==((c-1)/2))){
					diagonal+=a[i][j];
					//System.out.print(" # ");
				}
				else {
					diff+=a[i][j];
					//System.out.print(" $ ");
				}
				
			}
			res=diagonal-diff;
			System.out.println(" ");
		}
		System.out.println("Diagonal : "+res);
		System.out.println(" + mark : "+side);
		System.out.println("main methed started..");
	}
}