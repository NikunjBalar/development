class Testercalsi{
	public static void main (String [] args){
		Calculater c=new Calculater();
		double res=c.findpercentage(23,43,54,65,66,56,76,54);
		double res1=c.findpercentage(56,76,45,87,'b');
		System.out.println(res);
		System.out.println(res1);
	}
}