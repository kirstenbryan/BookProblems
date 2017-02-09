import java.util.Scanner;
/**
 * P2.10 - Write a program that helps a person decide whether to buy a hybrid car. Your program's inputs should
 * be: the cost of a new car, the estimated miles driven per year, the estimated gas price, the efficiency in miles
 * per gallon, and the estimated resale value after 5 years. Compute the total cost of owning the car for five
 * years. (For simplicity, we will not take the cost of financing into account.) Obtain realistic prices for a new
 * and used hybrid and a comparable car from the Web. Run your program twice, using today's gas price and 15,000
 * miles per year. Include pseudocode and the program runs with your assignment.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double HYBIRD_NEW_PRICE = 24000;
		final double HYBRID_NEW_RESALE = 11000;
		final double HYBRID_NEW_MPG = 51.00;
		final double HYBRID_USED_PRICE = 20000;
		final double HYBRID_USED_RESALE = 9000;
		final double HYBRID_USED_MPG = 50.00;
		
		System.out.println("Enter your car's price: ");
		double carPrice = input.nextDouble();
		System.out.println("Enter your car's resale price: ");
		double resalePrice = input.nextDouble();
		System.out.println("Enter your car's miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.println("Enter how many miles you drive per year: ");
		double milesPerYear = input.nextDouble();
		System.out.println("Enter the current gas price: ");
		double currentGasPrice = input.nextDouble();
		input.close();
		
		double carGasCost = 5 * ((milesPerYear / milesPerGallon) * currentGasPrice);
		double hybridNewGasCost = 5 * ((milesPerYear / HYBRID_NEW_MPG) * currentGasPrice);
		double hybridUsedGasCost = 5 * ((milesPerYear / HYBRID_USED_MPG) * currentGasPrice);
		
		double totalCarCost = carPrice + carGasCost - resalePrice;
		double newHybridTotalCost = HYBIRD_NEW_PRICE + hybridNewGasCost - HYBRID_NEW_RESALE;
		double usedHybridTotalCost = HYBRID_USED_PRICE + hybridUsedGasCost - HYBRID_USED_RESALE;
		
		System.out.printf("Your current cost after 5 years would be: %.2f\n", totalCarCost);
		System.out.printf("A 2017 Hybrid car would cost: %.2f\n", newHybridTotalCost);
		System.out.printf("A 2014 Hybrid car would cost: %.2f", usedHybridTotalCost);
		
	}

}