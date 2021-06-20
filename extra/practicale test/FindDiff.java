class FindDiff{
	public static void main(String [] args){
		System.out.println("main method started");
		int[] a={1,3,5,4,7,9};
		int[] b={1,3,4,7,8,9};
		
		for(int i=0;i<a.length;i++){
			for (int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println("same number : "+a[i]+" : "+b[j]);
					break;
				}
				
				else{
					System.out.println("diff number : "+a[i]+" : "+b[j]);
					//System.out.print(a[i]);
				}
			}
		}
	}
}