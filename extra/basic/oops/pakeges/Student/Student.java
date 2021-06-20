public class Student{
	public String name;
	public String emailId;
	public int rollNum;
	public long phoneNum;
	public static String university;
	
	public void getStudentDetails(){
		System.out.println(this.name+"\n"+this.emailId+"\n"+this.rollNum+
		"\n"+this.phoneNum);
	}
}