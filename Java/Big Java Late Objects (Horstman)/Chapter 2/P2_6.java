import java.util.Scanner;
/**
 * P2.6 - Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, 
 * and inches.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a measurement (in meters) to be converted: ");
		double measurement = input.nextDouble();
		input.close();
		
		final double METERS_TO_MILES = 0.000621371;
		final double METERS_TO_FEET = 3.28084;
		final double METERS_TO_INCHES = 39.3701;
		
		System.out.printf("Miles: %.2f\n", measurement * METERS_TO_MILES);
		System.out.printf("Feet: %.2f\n", measurement * METERS_TO_FEET);
		System.out.printf("Inches: %.2f", measurement * METERS_TO_INCHES);
		
	}

}