package Package0615a;

import java.util.Scanner;

public class MyActivity03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Please input your year:");
		int year = kb.nextInt();
		if (isleapYear(year))
		{
			System.out.println("The year is a leap year.");
		}
		else
		{
			System.out.println("The year is not a leap year.");
		}

		kb.close();
	}

	public static boolean isleapYear(int y)
	{
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		boolean c = (y % 400) == 0;
		return (a && b) || c;
	}

}
