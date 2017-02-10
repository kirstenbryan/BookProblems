import java.util.Scanner;
/**
 * P2.25 - Giving change. Implement a program that directs a cashier how to give change. The program has two inputs:
 * the amount due and the amount received from the customer. Display the dollars, quarters, dimes, nickels, and pennies
 * that the customer should receive in return. In order to avoid roundoff errors, the program should supply both
 * amounts in pennies, for example 274 instead of 2.74. (Assume the customer always gives the cashier more pennies
 * than the amount due).
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_25 {

	public static void main(String[] args) {

		final int PENNIES_PER_DOLLER = 100;
		final int PENNIES_PER_QUARTER = 25;
		final int PENNIES_PER_DIME = 10;
		final int PENNIES_PER_NICKEL = 5;
		final int PENNIES_PER_PENNY = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount due (in pennies): ");
		int amountDue = input.nextInt();
		System.out.println("Enter the amount given to the cashier (in pennies): ");
		int paidWith = input.nextInt();
		input.close();

		int returnBal = paidWith - amountDue;

		int dollars = returnBal / PENNIES_PER_DOLLER;
		returnBal -= (dollars * PENNIES_PER_DOLLER);
		int quarters = returnBal / PENNIES_PER_QUARTER;
		returnBal -= (quarters * PENNIES_PER_QUARTER);
		int dimes = returnBal / PENNIES_PER_DIME;
		returnBal -= (dimes * PENNIES_PER_DIME);
		int nickels = returnBal / PENNIES_PER_NICKEL;
		returnBal -= (nickels * PENNIES_PER_NICKEL);
		int pennies = returnBal / PENNIES_PER_PENNY;

		System.out.println("Cashier should return: " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes
							+ " dime(s), " + nickels + " nickel(s) and " + pennies + " pennies.");

	}

}