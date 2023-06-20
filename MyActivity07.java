package Package0615a;

import java.util.Scanner;

public class MyActivity07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the number of sides:");
		double sideNum = kb.nextDouble();

		System.out.println("Input the length of side:");
		double side = kb.nextDouble();

		System.out.printf("The area of the pentagon is %.4f%n",calculateArea(side));

		kb.close();
	}

	public static double calculateArea(double side)
	{
		double area = (1.0 / 4.0) * Math.sqrt(5.0 * (5.0 + 2.0 * Math.sqrt(5.0))) * Math.pow(side, 2);
		return area;
	}

}
