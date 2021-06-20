import java.util.*;

class sumOfMatrix
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i,j,r,c,sum=0,evenres=0,oddres=0;
	System.out.println("Enter the number of rows:");
	r = sc.nextInt();
	System.out.println("Enter the number of columns:");
	c = sc.nextInt();
	
	int[][] mat = new int[r][c];
 
     System.out.println("Enter the elements of the matrix") ;
     for(i=0;i<r;i++) { 
      for(j=0;j<c;j++)
		{ 
          mat[i][j] = sc.nextInt();
		}
	}
	System.out.println("The elements of the matrix") ;
     for(i=0;i<r;i++){ 
      for(j=0;j<c;j++)
		{ 
			System.out.print(mat[i][j]+"\t");
		}
       System.out.println("");
	}
	 for(i=0;i<r;i++){ 
      for(j=0;j<c;j++)
		{ 
				sum = sum + mat[i][j];
			
		}
	}
     System.out.println("SUM of elements of the matrix = "+sum) ;
	}	
}