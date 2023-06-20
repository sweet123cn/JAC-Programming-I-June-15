package Package0615a;

import java.util.Scanner;

public class MyActivity06 {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);

		System.out.println("Please input side-1:");
		double side1 = kb.nextDouble();

        System.out.println("Please input side-2:");
		double side2 = kb.nextDouble();

        System.out.println("Please input side-2:");
		double side3 = kb.nextDouble();

        double area = 0;

        double s = (side1 + side2 + side3) / 2.0;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("The area of the triangle is  %.4f %n" , area );

        kb.close();
	}

}
