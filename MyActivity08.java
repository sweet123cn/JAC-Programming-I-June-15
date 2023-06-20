package Package0615a;

import java.util.Scanner;

public class MyActivity08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number:");
		int Num = kb.nextInt();

		if (isPrime(Num))
		{
			System.out.println("it is a Prime");
		}
		else 
		{
			System.out.println("it is not a Prime");
		}

		kb.close();
	}

	public static boolean isPrime(int num)
	{
		
		if (num <= 1)
		{
			return false;
		}

		for ( int i = 2; i < num; i++ )
		{
			if (num%i == 0 )
			{
				return false;
			}
		}

		return true;
	}

}
