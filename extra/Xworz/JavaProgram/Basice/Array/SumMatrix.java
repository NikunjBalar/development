import java.util.*;

class SumMatrix
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
	 for(i=0;i<r;i++)
	 { 
      for(j=0;j<c;j++)
		{ 
			if(mat[i][j]%2==0)
			{
				evenres=evenres+mat[i][j];
			}
			else{
				oddres=oddres+mat[i][j];
			}
		}
	}
			System.out.println("even result = "+evenres) ;
			System.out.println("odd result = "+oddres) ;
	 for(i=0;i<r;i++){ 
      for(j=0;j<c;j++)
		{ 
			//if(i==j) //this condition checks for diagonal
			//{
				sum = sum + mat[i][j];
			//}
		}
	}
     System.out.println("SUM of DIAGONAL elements of the matrix = "+sum) ;
	}	
}