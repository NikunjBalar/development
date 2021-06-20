import java.util.*;
class DeleteNumberInArray
{
	public static void main(String[] args)                              
	{
			DeleteNumberInArray numInArray = new DeleteNumberInArray();
			int[] num=numInArray.generateArray();
			numInArray.displayArray(num);
			num=numInArray.deleteFromArray(num);
			numInArray.displayArray(num);
	}
	public void displayArray(int[] array){
		System.out.println("After Setting Array");
			for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
	}
	public int[] generateArray(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		int[] number=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter Index "+i+" Value: ");
			number[i]=sc.nextInt();
		}
		return number;	
	}
	public int[] deleteFromArray(int[] num){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Index Number for Delete value:");
		int index=sc.nextInt();
		if(index >= num.length){
			return num;
		}else{
			int[] ans=new int[num.length-1];
			int count=0;
			for(int i=0;i<num.length;i++){
				if(i!=index){
					ans[count++]=num[i];
				}
			}
			return ans;
		}	
	}
}