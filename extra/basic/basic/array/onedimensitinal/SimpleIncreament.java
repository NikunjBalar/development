class SimpleIncreament{
	public static void main(String [] args){
		System.out.println("mainmethod started..");
	
		int[] a={12,23,34,45,56};
		for(int i=0; i<a.length; i++){
			System.out.print((a[i])+" ");
		}
		for(int i=0; i<a.length; i++){
			System.out.println("a+1="+(a[i]+1));
		}
		int count=1;
		for (int i=0; i<a.length;i++){
			count=count+i;
			System.out.println("count-----====>>>"+count);
			System.out.println("a+i====>>>"+(a[i]+count));
			count=1;
		}
	}
}