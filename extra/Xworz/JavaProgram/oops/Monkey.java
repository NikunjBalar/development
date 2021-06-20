class Monkey
{
	public static void main(String[] args)
	{
		int [] arr={1,2,3,4,5,6};
		int k=0;
		int temp=0;
		while(k<3){
		
			temp=arr[5];
			for(int i=5;i>=0;i--){
			
				if(i==0){
					arr[i]= temp;
				}
				else{
					arr[i] = arr[i-1];
				}
				System.out.println("");
			}
				for(int j=0;j<arr.length;j++)
					{
						System.out.println("\t"+arr[j]);
					}
			
			k++;
		}
		System.out.println("time="+k);
	}
}