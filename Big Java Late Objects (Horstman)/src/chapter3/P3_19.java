package chapter3;
import java.util.Scanner;

/**
 * P3.19 - Write a program that reads in two floating-point numbers and tests whether they are the same up to two
 * decimal places. Here are two sample runs.
 * 		Enter two floating-point numbers: 2.0 1.99998
 * 		They are the same up to two decimal places.
 * 		Enter two floating-point numbers: 2.0 1.98999
 * 		They are different.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two floating-point numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		input.close();

		if (Math.abs(num1 - num2) <= 0.01)
			System.out.println("They are the same up to two decimal places");
		else
			System.out.println("They are different");

	}

}