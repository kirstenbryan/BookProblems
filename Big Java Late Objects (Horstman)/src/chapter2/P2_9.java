package chapter2;
import java.util.Scanner;
/**
 * P2.9 - Improve the program discussed in How To 2.1 to allow input of quarters in addition to bills.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int PENNIES_PER_DOLLAR = 100;
		final int PENNIES_PER_QUARTER = 25;
		
		System.out.println("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
		int billValue = input.nextInt();
		System.out.println("Enter number of quarters: ");
		double quarterValue = input.nextInt() * 0.25;
		double totalValue = billValue + quarterValue;
		System.out.println("Enter item price in pennies: ");
		int itemPrice = input.nextInt();
		input.close();
		
		// Compute change due

		double changeDue = PENNIES_PER_DOLLAR * totalValue - itemPrice;
		int dollarCoins = (int) (changeDue / PENNIES_PER_DOLLAR);
		changeDue = changeDue % PENNIES_PER_DOLLAR;
		int quarters = (int) (changeDue / PENNIES_PER_QUARTER);
		
		// Print change due
		
		System.out.printf("Dollar coins: %6d", dollarCoins);
		System.out.println();
		System.out.printf("Quarters:     %6d", quarters);
		System.out.println();
		
	}

}