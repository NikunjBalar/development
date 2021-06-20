class CharToNum{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		CharToNum cn=new CharToNum();
		cn.Char();
		
		System.out.println("main method ended..");
	}
	
	void Char(){
		for(int i=1; i<=256; i++){
			char c=(char)i;
			System.out.println(i+" "+c);
		}
	}
}
