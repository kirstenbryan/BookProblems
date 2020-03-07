package chapter2;
import java.util.Scanner;
/**
 * P2.4 - Write a program that prompts the user for two integers and then prints: the sum, the difference, the product,
 * the average, the distance, the maximum, and the minimum.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.close();
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		double average = (num1 + num2) / 2.0;
		int distance = Math.abs(difference);
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.printf("Average: %.1f\n", average);
		System.out.println("Distance: " + distance);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
				
	}

}
