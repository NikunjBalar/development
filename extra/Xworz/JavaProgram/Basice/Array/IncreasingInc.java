import java.util.*;
class IncreasingInc
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size,i;
		System.out.println("enetr the array size");
		size =sc.nextInt();
		int[] array= new int[size];
		
			System.out.println("enetr the array element");
			for(i=0;i<size;i++)
			{
			array[i]=sc.nextInt();
			}
			System.out.println("enetr the array element are:");
			for(i=0;i<size;i++)
			{
			System.out.print(array[i]+"\t");
			}
			for(i=0;i<size;i++)
			{
			array[i]=array[i]+(i+i);
			}
			System.out.println("\n method ended....result");
			for(i=0;i<size;i++)
			{
			System.out.print(array[i]+"\t");
			}
		
	}
}