package Package0615a;

import java.util.Scanner;

public class MyActivity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Input an integer:");
		int num = kb.nextInt();

		boolean oddFlag=true;

		int digit  = 0;

		num=Math.abs(num);

		while (num>=10)
		{
			digit = num % 10;
			num = num / 10;
			if (digit % 2 ==0)
			{
				oddFlag =false;
				break;
			} 
		}

		if (num % 2 ==0)
		{
			oddFlag =false;
		}

		
		if (oddFlag)
		{
			System.out.println("every digit is odd");
		}
		else
		{
			System.out.println("Not every digit is odd");
		}

		kb.close();
	}

}
