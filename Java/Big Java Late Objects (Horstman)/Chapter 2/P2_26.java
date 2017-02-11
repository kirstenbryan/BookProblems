import java.util.Scanner;
/**
 * P2.26 - An online bank wants you to create a program that shows prospective customers how their deposits will
 * grow. Your program should read the initial balance and the annual interest rate. Interest is compounded monthly.
 * Print out the balances after the first three months. Here is a sample run:
 * 			Initial balance: 1000
 * 			Annual interest rate in percent: 6.0
 * 			After first month:		1005.00
 * 			After second month:		1010.03
 * 			After third month:		1015.08
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Initial balance: ");
		double balance = input.nextDouble();
		System.out.println("Annual interest rate in percent: ");
		double annualInterestRate = input.nextDouble();
		input.close();
		
		double monthlyInterestRate = annualInterestRate / 12.0 / 100.0;

	    	double firstMonth = balance + (balance * monthlyInterestRate);
	    	double secondMonth = firstMonth + (firstMonth * monthlyInterestRate);
	    	double thirdMonth = secondMonth + (secondMonth * monthlyInterestRate);
	    
	   	System.out.printf("After first month:\t%.2f\n", firstMonth);
	    	System.out.printf("After second month:\t%.2f\n", secondMonth);
	    	System.out.printf("After third month:\t%.2f\n", thirdMonth);

	}

}
