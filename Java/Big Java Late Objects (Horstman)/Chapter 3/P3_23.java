import java.util.Scanner;

/**
 * P3.23 - The TaxCalculator.java program uses a simplified version of the 2008 U.S. income tax schedule. Look up the
 * tax brackets and rates for the current year, for both single and married filers, and implement a program that
 * computes the actual income tax. (Illinois 2016)
 * 
 *  *  if your status is single and 
 *  if the taxable income is over  	 but not over          the tax is   
 *  		$0                          $9,275                 10% 
 *  		$9,275                      $37,650            	   15%
 *  		$37,650						$91,150                25%
 *    		$91,150						$190,150               28%
 *   		$190,150					$413,350               33%
 *   		$413,350					$415,050               35%
 *   		$415,050							               39.6%
 *  
 *  if your status is Married and 
 *  if the taxable income is over    but not over          the tax is           	
 *  		$0                          $18,550                10% 
 *  		$18,550                     $75,300            	   15%
 *  		$75,300						$151,900               25%
 *    		$151,900					$231,450               28%
 *   		$231,450					$413,350               33%
 *   		$413,350					$466,950               35%
 *   		$466,950						              	   39.6%
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double tax = 0;

		System.out.print("Married or Single (M or S): ");
		String status = input.next();
		System.out.println("Enter your income: ");
		double income = input.nextDouble();
		input.close();

		if (status.toLowerCase().equals("s")) {
			if (income <= 9275)
				tax = income * 0.10;
			else if (income <= 37650)
				tax = income * 0.15;
			else if (income <= 91150)
				tax = income * 0.25;
			else if (income <= 190150)
				tax = income * 0.28;
			else if (income <= 413350)
				tax = income * 0.33;
			else if (income <= 415050)
				tax = income * 0.35;
			else
				tax = income * 0.396;
		} else {
			if (income <= 18550)
				tax = income * 0.10;
			else if (income <= 75300)
				tax = income * 0.15;
			else if (income <= 151900)
				tax = income * 0.25;
			else if (income <= 231450)
				tax = income * 0.28;
			else if (income <= 413350)
				tax = income * 0.33;
			else if (income <= 466950)
				tax = income * 0.35;
			else
				tax = income * 0.396;
		}
		
		System.out.println("Your tax: " + tax);
		
	}

}