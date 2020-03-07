package chapter3;
import java.util.Scanner;
/**
 * P3.5 - Write a program that reads three numbers and prints "increasing" if they are in increasing order, 
 * "decreasing" if they are decreasing in order, and "neither" otherwise. Here, "increasing" means "strictly
 * increasing", with each value larger that its predecessor. The sequence 3 4 4 would not be considered increasing.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();

		if (num1 < num2 && num2 < num3)
			System.out.println("Increasing.");
		else if (num1 > num2 && num2 > num3)
			System.out.println("Decreasing.");
		else
			System.out.println("Neither.");

	}

}