import java.util.Scanner;
class vibgyorUsingIf
{
	public static void main(String[] args)
	{
	String s;
	Scanner scn= new Scanner(System.in);
	System.out.println("give me the first letter of a rainbow color");
	s=scn.nextLine();
		

		if(s.equals("v"))
			System.out.println("the first color in the rainbow is violet.\n its usually seen along the top of the rainbow");
		else if(s.equals("i"))
			System.out.println("the second color in the rainbow is indigo.\n its usually seen between violet and blue in the rainbow");
		else if(s.equals("b"))
			System.out.println("the third color in the rainbow is blue\n its usually seen between indigo and green in the rainbow");
		else if(s.equals("g"))
			System.out.println("the fourth color in the rainbow is green.\n its usually seen between blue and yellow in the rainbow");
		else if(s.equals("y"))
			System.out.println("the fifth color in the rainbow is yellow.\n its usually seen between green and orange in the rainbow");
		else if(s.equals("o"))
			System.out.println("the sixth color in the rainbow is orange.\n its usually seen between yellow and red in the rainbow");
		else if(s.equals("r"))
			System.out.println("the seventh color in the rainbow is red.\n its usually seen along the end of the rainbow");
		else
			System.out.println("no such color exists in a rainbow");

	}
}