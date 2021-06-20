class Tester{
	public static void main(String[] ar){
		System.out.println("mms");
		
		Student st=new Student();
		st.name="Nikunj";
		st.emailId="nikunjbalar15@gmail.come";
		st.phoneNum=9898989898l;
		st.rollNum=110;
		
		Student.university="vtu";
		st.getStudentDetails();
		System.out.println(Student.university);
		System.out.println("mme");
	}
}