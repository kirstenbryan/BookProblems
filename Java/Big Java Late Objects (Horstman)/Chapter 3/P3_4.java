import java.util.Scanner;
/**
 * P3.4 - Write a program that reads three numbers and prints "all the same" if they are all the same, "all 
 * different" if they are all different, and "neither" otherwise.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();

		if (num1 == num2 && num1 == num3)
			System.out.println("All the same.");
		else if (num1 != num2 && num1 != num3)
			System.out.println("All different.");
		else
			System.out.println("Neither.");

	}

}