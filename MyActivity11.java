package Package0615a;

import java.util.Scanner;

public class MyActivity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Input an integer(positive or negative):");
		int num = kb.nextInt();

		num = Math.abs(num);

		while (num >= 10)
		{
			num = num /10;
		}
		
		System.out.println("the first digit is " + num);

		kb.close();
	}

}
