import java.util.*;
class vibgyor 
{
	public static void main(String[] args) 
	{
		
		char c;
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("press p to get the position of a color in the rainbow.\nAlternatively press c to enter the position and get the color assosciated with it");
		
		c=scan.next().charAt(0);
		
	if(c=='p')
		{
		//Scanner scan=new Scanner(System.in);
		System.out.println("enter the color");
		String s = scan.nextLine();
		
		if(s.equals("violet"))
			System.out.println("its position is on the first along the spectrum.\n its usually seen along the top of the rainbow");
		else if(s.equals("indigo"))
			System.out.println("its position is on the second along the spectrum.\n its usually seen between violet and blue in the rainbow");
		else if(s.equals("blue"))
			System.out.println("its position is on the third along the spectrum.\n its usually seen between indigo and green in the rainbow");
		else if(s.equals("green"))
			System.out.println("its position is on the fourth along the spectrum.\n its usually seen between blue and yellow in the rainbow");
		else if(s.equals("yellow"))
			System.out.println("its position is on the fifth along the spectrum.\n its usually seen between green and orange in the rainbow");
		else if(s.equals("orange"))
			System.out.println("its position is on the sixth along the spectrum.\n its usually seen between yellow and red in the rainbow");
		else if(s.equals("red"))
			System.out.println("its position is on the seventh along the spectrum.\n its usually seen along the end of the rainbow");
		}


	else if(c=='c')
		{
		
		System.out.println("enter the position");
		n=scan.nextInt();
		

		if(n==1)
			System.out.println("the first color in the rainbow is violet.\n its usually seen along the top of the rainbow");
		else if(n==2)
			System.out.println("the second color in the rainbow is indigo.\n its usually seen between violet and blue in the rainbow");
		else if(n==3)
			System.out.println("the third color in the rainbow is blue\n its usually seen between indigo and green in the rainbow");
		else if(n==4)
			System.out.println("the fourth color in the rainbow is green.\n its usually seen between blue and yellow in the rainbow");
		else if(n==5)
			System.out.println("the fifth color in the rainbow is yellow.\n its usually seen between green and orange in the rainbow");
		else if(n==6)
			System.out.println("the sixth color in the rainbow is orange.\n its usually seen between yellow and red in the rainbow");
		else if(n==7)
			System.out.println("the seventh color in the rainbow is red.\n its usually seen along the end of the rainbow");
		 }
	
	}

		
	}
