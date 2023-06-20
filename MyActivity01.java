package Package0615a;

//import java.util.Scanner;

public class MyActivity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner kb = new Scanner(System.in);
		// System.out.println("please inut the pentagonal number:");
		// int num = kb.nextInt();
		int num = 50;

		int penNum = 0;

		for (int i = 1; i <= num; i++)
		{
			penNum = getPentagonalNumber(i);

			System.out.printf("%5s", penNum);

			if (i % 10 == 0)
			{
				System.out.println();
			}
		}

		// kb.close();
	}

	public static int getPentagonalNumber (int num)
	{
		return num * (3 * num - 1) / 2;

	}

}
