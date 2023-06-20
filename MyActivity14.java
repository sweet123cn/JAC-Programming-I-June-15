package Package0615a;

import java.util.Scanner;

public class MyActivity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Input an String:");
		String str = kb.next();

		boolean vowelFlag = true;

		for (int i = 0; i < str.length(); i++)
		{
			char mychar = str.charAt(i);
			if (!isVowel(mychar))
			{
				vowelFlag = false;
				break;
			}

		}

		if (vowelFlag)
		{
			System.out.println("All characters you input are vowels:" + true);
		}
		else
		{
			System.out.println("All characters you input are vowels:" + false);
		}

		kb.close();
	}

	public static boolean isVowel(char c)
	{
		c = Character.toUpperCase(c);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
