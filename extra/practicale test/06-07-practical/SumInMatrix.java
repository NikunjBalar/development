class SumInMatrix{
	public static void main(String[] ar){
		System.out.println("main method started..");
		int raw=5,colume=5;
		int[][] a={
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5}
		};
		int dig=0,dig1=0,frc=0,src=0;
		//int n=a.length;
		for(int i=0;i<raw;i++){
			for(int j=0;j<colume;j++){
				if(a[i]==a[j] || i+j==(raw-1)){
					dig+=(a[i][j]);
				}
				/*else if(i+j==(raw-1)){
					dig+=(a[i][j]);
				}*/
			}
		}
		for(int i=0;i<raw;i++){
			for(int j=0;j<colume;j++){
				if(a[i]!=a[j] && i+j!=(raw-1)){ 
					frc+=a[0][j];
				}
				else if(a[i]!=a[j] || i+j!=(0)){
					src+=a[i][0];
				}
				else if(a[i]!=a[j] && i+j!=(raw-1)){
					src+=a[4][j];
				}
			}
		}
		System.out.println(frc);
		System.out.println("sum of first raw colume..."+src);
		System.out.println("sum of diagonal.."+dig);
		System.out.println("main method ended.");
	}
}