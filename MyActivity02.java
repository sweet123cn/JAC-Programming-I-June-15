package Package0615a;

import java.util.Scanner;

public class MyActivity02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please input the inverstment amount:");
		double principle = kb.nextDouble();

		while ( principle < 0 )
		{
			System.out.println("principle invalid, please input positive num:");
			principle = kb.nextDouble();
		}

		System.out.println("please input the interestRate:");
		double interestRate = kb.nextDouble()/100;

		while ( interestRate < 0 )
		{
			System.out.println("interestRate invalid, please input positive num:");
			interestRate = kb.nextDouble()/100;
		}

		System.out.println("please input the number Of Years:");
		int numOfYears = kb.nextInt();

		while ( numOfYears < 0 )
		{
			System.out.println("number of years invalid, please input positive num:");
			numOfYears = kb.nextInt();
		}

		double value = principle;

		System.out.println("Years      FutureValue");

		for ( int i = 1 ; i <= numOfYears ; i++ )
		{
			value = value + value * interestRate;
			System.out.format("%-10s %11.2f %n", i, value  );
		}

		kb.close();
	}

}
