class Calculater{
	double findpercentage(int p1,int p2,int p3,int p4,char ch){
		
		double percentage;
		if (ch =='c'){
		percentage=(p1+p2+p3+p4)*100/400;
		}
		else if (ch =='b'){
		percentage=(p1+p2+p3+p4)*100/500;
		}
		else{
		percentage=(p1+p2+p3+p4)*100/300;
		}
		return percentage;
	}	
	double findpercentage(int p1,int p2,int p3,int p4,int p5, int p6,int p7,int p8){
		double percentage=(p1+p2+p3+p4+p5+p6+p7+p8)*100/800;
		return percentage;
	}	
	double findpercentage(double p1,double p2,double p3,double p4,double p5){
		double percentage=(p1+p2+p3+p4)*100/400;
		return percentage;
	}
}