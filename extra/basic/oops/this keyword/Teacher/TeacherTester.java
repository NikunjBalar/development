class Teacher{
	String name;
	long phoneNum;
	String subject;
	
	Teacher(String name,long phoneNum, String subject){
		System.out.println("3 param consttructor..");
		name=name;
		this.phoneNum=phoneNum;
		this.subject=subject;
	}
	
	void getTeacherDetails(){
		System.out.println("name:"+this.name+"\nSubject:"+this.subject+"\nphoneNum:"+this.phoneNum);
	}
}


class TeacherTester{
	public static void main(String[] args){
		System.out.println("main method started..");
		
		Teacher t = new Teacher("omkar",7856346734l,"java");
		t.getTeacherDetails();
		System.out.println("main method endedd..");
	}
}