import java.util.Scanner;
/**
 * P2.3 - Write a program that reads a number and displays the square, cube, and fourth power. Use the Math.pow method
 * only for the fourth power.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a number: ");
		double num = input.nextDouble();
		input.close();
		
		double square = num * num;
		double cube = num * num * num;
		double fourthPow = Math.pow(num, 4);
		
		System.out.printf("Square: %.2f\n", square);
		System.out.printf("Cube: %.2f\n", cube);
		System.out.printf("Fourth: %.2f", fourthPow);
				
	}
	
}