class Monkey{
	public static void main(String[] ar){
		int[] a={3,6,5,4,1,2};
		
		int k=0;
		int temp=0;
		while (k<6){
			temp=a[5];
			for (int i=5;i>=0;i--){
				if(i==0){
				a[i]=temp;
				}
				else{
					a[i]=a[i-1];
				}
				for (int j=0;j<a.length;j++){
				System.out.println(a[i]+"\t");
				}
			System.out.println();
			}
			k++;
		}
		System.out.println("time="+k);
	}
}