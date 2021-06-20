import java.util.Scanner;
class Task
{
	public static void main(String[] args)
	{
		System.out.println("main method started..");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no of rows..");
		int rows =sc.nextInt();
		
		System.out.println("enter no of coloumn.. ");
		int colms =sc.nextInt();
		int i,j,sum=0,sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0;
		int[][] a=new int[rows][colms];
		
		System.out.println("enter data  ");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colms;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("display array data..");
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colms;j++)
			{
				System.out.print(" "+a[i][j]);		
			}
			System.out.println(" ");
		}
	
		for(i=0; i<rows; i++)
		{
			for(j=0; j<colms; j++)
			{
				if(i==j)
				{
					sum1 = sum1+a[i][j];
				}
				else
				if((i+j)==(rows-1))
				{
					sum2=sum2+a[i][j];
				}
			}
		}
			
		sum=sum1+sum2;
		System.out.print("sum of 1st dia elements:" +sum);
		
		for(i=0; i<rows-1; i++)
		{
			for(j=0; j<colms-1; j++)
			{
				if(i==j)
				{
					System.out.println(" ");
				}
				else
				if((i+j)==j)
				{
					sum3=sum3+a[i][j];
				}
				else
				if((i+j)==i)
				{
					sum4=sum4+a[i][j];
				}
			}
		}
			for(i=0; i<rows-1; i++)
			{
				for(j=0; j<colms-1; j++)
				{
					if(j==4)
					{
						i++;
						sum5=sum5+a[i][j];
						//System.out.println(" ");
					}
					else
					if(i==4)
					{
						j++;
						sum6=sum6+a[i][j];
					}
				}
			}
			sum7=sum3+sum4+sum5+sum6;
			System.out.println("\n sum of 1st row:" +sum3);
			System.out.println("sum of 1st col:" +sum4);
			System.out.println("\n sum of 1st row:" +sum5);
			System.out.println("sum of 1st col:" +sum6);
			System.out.println("sum:" +sum7);
		
		
	}	
}
				