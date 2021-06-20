class SumOfArryElement{
	public static void main(String[] ar){
		System.out.println("main method started..");
		
		int[][]a={
			{12,23,34},
				{11,32,43},
					{10,56,65}
		};
		int res=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				res+=a[i][j];
			}
		}
		System.out.println("sum of arry element : "+res);
		System.out.println("main method ended..");
	}
}