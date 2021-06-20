class Tester{
	public static void main(String[] args){
	System.out.println("Main method started...");
	
	Mobile m1 = new Mobile();
	m1.brandName =" moto";
	m1.modelName=" galaxy";
	m1.color="black";
	m1.price=7000.7;
	m1.NumberofCamera=2;
	
	
	m1.Sendcall();
	m1.sendSMS();
	
	System.out.println(m1.brandName);
	System.out.println(m1.modelName);
	System.out.println(m1.color);
	System.out.println(m1.price);
	System.out.println(m1.NumberofCamera);
	
	}
}