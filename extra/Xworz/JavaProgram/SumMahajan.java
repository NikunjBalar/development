import java.util.Scanner;
class SumMahajan{
	public static void main(String[] args){
		int diagonalSum = 0;
		int firstRowSum = 0;
		int firstColSum = 0;
		int lastColSum = 0;
		int lastRowSum = 0;
		int middleSum = 0;
		int sideSum = 0;
		int r ,c,i,j;
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of row");
		r=sc.nextInt();
		System.out.println("enter number of column");
		c=sc.nextInt();
		int[][] a =new int[r][c];
		System.out.println("Enter the elements of the matrix") ;
		for( i=0;i<r;i++) { 
		for( j=0;j<c;j++)
			{ 
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The elements of the matrix") ;
		for(i=0;i<r;i++){ 
		for(j=0;j<c;j++)
			{ 
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		
		for( i=0;i<a.length;i++){
			for( j=0;j<a.length;j++){
				if((i==j) || (i+j==a.length-1)){
					diagonalSum+= a[i][j];
				}
				else if(j==0 && i!=0 && i!=r-1){
					firstColSum+= a[i][j];
					//System.out.println("firstColSum:" +firstColSum);
				}
				else if(i==0 && j!=0 && j!=c-1){
					firstRowSum+= a[i][j]; 
				//System.out.println("firstRowSum:" +firstRowSum);
				}
				else if(j==c-1 && i!=0 && i!=r-1){
					lastColSum+= a[i][j];
				}
				else if(i==r-1 && j!=0 && j!=c-1){
					lastRowSum+= a[i][j];
				}
				else{
					middleSum+= a[i][j];
				}
				sideSum= firstRowSum + lastRowSum + firstColSum + lastColSum;
			}
		}
		System.out.println("Sum of diagonal elements = " +diagonalSum);
		System.out.println("Sum of Side elements = " +sideSum);
		System.out.println("Sum of Middle elements = " +middleSum);
	}
}