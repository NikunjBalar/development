package bridglabs.appti.day9;

import java.util.Scanner;

public class StringPoem {

	static void printpoem(String animal ,String sound) {
		String str1="Old MacDonald had a farm \r\n" + 
				"Ee i ee i o\r\n" + 
				"And on his farm he had some animal \r\n" + 
				"Ee i ee i oh\r\n" + 
				"With a sound-sound here\r\n" + 
				"And a sound-sound there\r\n" + 
				"Here a sound, there a sound\r\n" + 
				"Everywhere a sound-sound";
		String str4=str1.replace("sound", sound);
		String str5=str4.replace("animal", animal);
		System.out.println(str5);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Animal name");
		String animal=s.next();
		System.out.println("Enter Animal Sound ");
		String sound=s.next();
		
	printpoem(animal, sound);	
	}
}
