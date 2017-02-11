import java.util.Scanner;
/**
 * P3.2 - Write a program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, 
 * print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large"
 * if it exceeds 1,000,000.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number: ");
		double num = input.nextDouble();
		input.close();
	
		if(num > 1000000) {
			System.out.println("Large.");
		}
		else if(num == 0) {
			System.out.println("Zero.");			
		}
		else if(Math.abs(num) < 1) {
			System.out.println("Small.");
		}
		else if(num < 0) {
			System.out.println("Negative.");
		}
		else if(num > 0) {
			System.out.println("Positive.");
		}
		
	}

}