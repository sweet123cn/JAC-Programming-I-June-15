package Package0615a;

import java.util.Random;
import java.util.Scanner;

public class MyActivity05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Please input a number:");
		int num = kb.nextInt();

		int[][]  matrix = new int[num][num];
		Random random = new Random();

		for (int i  = 0 ; i < num; i++)
		{
			for (int j = 0; j< num; j++)
			{
				if (random.nextBoolean())
				{
					matrix[i][j] = 1;
				}
				else
				{
					matrix[i][j] = 0;
				}
				
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		kb.close();
 	}

}
