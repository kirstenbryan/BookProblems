import java.util.Scanner;

/**
 * P3.15 - Write a program that reads in three floating-point numbers and prints the largest of the three inputs.
 * For example:
 * 		Please enter three numbers: 4  9  2.5
 * 		The largest numbers is 9.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float largestNum;

		System.out.println("Please enter three numbers: ");
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		float num3 = input.nextFloat();
		input.close();

		if (num1 > num2 && num1 > num3)
			largestNum = num1;
		else if (num2 > num1 && num2 > num3)
			largestNum = num2;
		else
			largestNum = num3;

		System.out.println("The largest number is " + largestNum + ".");

	}

}