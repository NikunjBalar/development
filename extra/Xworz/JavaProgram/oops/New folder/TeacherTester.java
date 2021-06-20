class Teacher{
	String name;
	long phoneNum;
	String subject;
	
	Teacher(String name, long phoneNum, String subject){
		System.out.println("3 param constructor.....");
		name= name;
		this.phoneNum = phoneNum;
		this.subject = subject;
		
	}
	
	void getTeacherDeatail(){
		System.out.println("Name:"+this.name+"\n Subject:"+this.subject+"\nPhoneNum:"+this.phoneNum);
	}
}

class TeacherTester{
	public static void main(String[] args){
		System.out.println("Main method started......... ");
		
		Teacher t = new Teacher("paras",9898988989l,"framwork");
		t.getTeacherDeatail();
		System.out.println("Main method ended............");
	}
}