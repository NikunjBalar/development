class SecondBiggestNum{
	public static void main(String[] ar){
		System.out.println("main method started..");
		
		int n,temp;
		int[] a={34,-8,6,13,23};
		n=a.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("ascending order :");
		for (int i=0; i<n-1;i++){
			System.out.print(a[i]+",");
		}
		System.out.println(a[n-1]);
		System.out.println("Second biggest Num : "+a[n-2]);
		System.out.println("main method ended..");
	}
}