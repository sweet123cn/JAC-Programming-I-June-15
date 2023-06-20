package Package0615a;

import java.util.Scanner;

public class MyActivity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Input an integer(positive or negative):");
		int num = kb.nextInt();

		int origialNum = num;

		num = Math.abs(num);

		int count = 0;
		int remain = 0;

		while (num >= 0)
		{
			if (num % 3 == 0 )
			{
				count ++;
				num /= 3;
			}
			else
			{
				remain = num;
				break;
			}
		}

		if ( origialNum >= 0)
		{
			System.out.print( origialNum + " = ");
		}
		else
		{
			System.out.print( origialNum + " = -");
		}
		
		for (int i = 1; i <= count; i++)
		{
			System.out.print("3 * ");
		}
		System.out.println( remain);

		kb.close();
	}

}
