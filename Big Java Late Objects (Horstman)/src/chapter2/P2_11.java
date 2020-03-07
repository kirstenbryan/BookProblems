package chapter2;
import java.util.Scanner;
/**
 * P2.11- Write a program that asks the user to input: the number of gallons of gas in the tank, the fuel efficiency
 * in miles per gallon, the price of gas per gallon. Then print the cost per 100 miles and how far the car can go 
 * with the gas in the task.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_11 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in gallons the amount of gas in your tank: ");
		double gallonsInTank = input.nextDouble();
		System.out.println("Enter your cars miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.println("Enter the current price of gas: ");
		double gasPrice = input.nextDouble();
		input.close();
		
		double costPerHundred = (gasPrice * 100.0) / milesPerGallon;
		double distanceCarCanTravel = gallonsInTank * milesPerGallon;
		
		System.out.printf("The cost of gas per 100 miles: $%.2f\n", costPerHundred);
		System.out.printf("How many miles you can go on your current gas tank: %.2f miles", distanceCarCanTravel);
		
	}

}