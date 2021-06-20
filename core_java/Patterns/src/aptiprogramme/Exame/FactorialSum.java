package aptiprogramme.Exame;

public class FactorialSum {
	public static void main(String[] args) {
		/*int n=4;
		int fsum=0;
		for (int i = 1; i <=n; i++) {
			int sum=1;
			for (int j = i; j>0; j--) {
				sum*=j;
				//System.out.println(sum);
			}
			fsum+=sum;
			System.out.println(sum);
		}
		//System.out.println(fsum);
*/
		int res=1;
		int total=1;
		
		System.out.println(res);
		for (int i = 2; i <=5; i++) {
			res=i*res;
			total=total+res;
			System.out.println(res);
			//System.out.println(total);

		}
		System.out.println(total);
	
	}
}
