import java.util.Scanner;
class vibgyorUsingSwitch
{
	public static void main(String[] args)
	{
		char c;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the first letter of a color in the rainbow");
		c=scn.next().charAt(0);
		switch(c)
		{
			case 'v':System.out.println("entered color is violet");
			break;
			case 'i':System.out.println("entered color is indigo");
			break;
			case 'b':System.out.println("entered color is blue");
			break;
			case 'g':System.out.println("entered color is green");
			break;
			case 'y':System.out.println("entered color is yellow");
			break;
			case 'o':System.out.println("entered color is orange");
			break;
			case 'r':System.out.println("entered color is red");
			break;
			default:System.out.println("no such color exists");
		}

	}
}