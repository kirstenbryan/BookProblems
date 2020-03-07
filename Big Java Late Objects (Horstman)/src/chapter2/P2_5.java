package chapter2;
import java.util.Scanner;
/**
 * P2.5 - Enhance the output of Exercise P2.4 so that the numbers are properly aligned: ...
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_5 {
	
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
		
		System.out.printf("Sum: %11d\n", sum);
		System.out.printf("Difference: %4d\n", difference);
		System.out.printf("Product: %7d\n", product);
		System.out.printf("Average: %9.1f\n", average);
		System.out.printf("Distance: %6d\n", distance);
		System.out.printf("Maximum: %7d\n", max);
		System.out.printf("Minimum: %7d\n", min);
				
	}

}