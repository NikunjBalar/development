class CalculaterMarks{
	
		double findPercentage(int m1,double m2,int m3,int m4, char ch){
			double percent;
			if(ch == 'b')
			{
			percent=((m1+m2+m3+m4)*100)/400;
				
			}
			else{
			percent=((m1+m2+m3+m4)*100)/500;
			}
		return percent;
		}
		
		double findPercentage(double m1,int m2,int m3,int m4,int m5,int m6,int m7,int m8){
		double percent=((m1+m2+m3+m4+m5+m6+m7+m8)*100)/800;
		return percent;
		}
}