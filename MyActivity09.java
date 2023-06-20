package Package0615a;

import java.util.Scanner;

public class MyActivity09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the first number:");
		int num1 = kb.nextInt();

		System.out.println("Input the second number:");
		int num2 = kb.nextInt();

		System.out.println("Input the third number:");
		int num3 = kb.nextInt();

		int[] num  = {num1,num2,num3};
		int temp = 0;

		if (num[0] > num[1])
		{
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		}

		if (num[1] > num[2])
		{
			temp = num[1];
			num[1] = num[2];
			num[2] = temp;
		}

		if (num[0] > num[1])
		{
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		}

		System.out.println("the three numbers after sort are " + num[0] + " " + num[1] + " " + num[2]);

		if ( (num[0] + 1 == num[1]) && (num[1] + 1 == num[2]) )
		{
			System.out.println("the three numbers are consecutive");
		}
		else 
		{
			System.out.println("the three numbers are not consecutive");
		}

		kb.close();
	}

}
