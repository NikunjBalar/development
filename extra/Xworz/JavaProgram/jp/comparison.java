class comparison
{
	public static void main(String[] args) 
	{
		String str1="the quick brown fox jumped over the lazy dog";
		String str2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.println("Hello! today we compare two strings\n\n");
		System.out.println("the first string is \n" +str1);
		System.out.println("\n\nthe second string is\n" +str2);
		System.out.println("\n\n we will check if the second string letters occur in the first one.\n");
	}
		private boolean sameChars(String str1, String str2)
		{
		char[] first = str1.toCharArray();
		char[] second = str2.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		
		return Arrays.equals(first,second);
		}

	}

