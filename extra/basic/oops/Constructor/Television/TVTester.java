class TVTester{
	public static void main (String[] args){
		System.out.println("main method started..");
		
		Television tv=new Television();
		tv.brandName="sony";
		tv.price= 28000.897;
		tv.size=32;
		
		//Television tv1=new Television("penasonic",32,25000.7364);
		//System.out.println(tv1.brandName);
		
		System.out.println("main method ended..");
	}
}