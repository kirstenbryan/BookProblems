package chapter3;
import java.util.Scanner;

/**
 * P3.22 - Write a program that computes taxes for the following schedule.
 * 
 *  if your status is single and 
 *  if the taxable income is over  	 but not over        	the tax is          	of the amount over 
 *  		$0                          $8,000                  10%                			$0 
 *  		$8,000                      $32,000              	$800 +  15%           		$8,000 
 *  		$32,000                                             $4,400 + 25%          		$32,000 
 *  
 *  if your status is Married and 
 *  if the taxable income is over    	but not over        	the tax is           	of the amount over 
 *  			$0                          $16,000                 10%                     	$0 
 *  			$16,000                     $64,000                 $1,600 + 15%            	$16,000 
 *  			$64,000                                             $8,800 + 25%           		$64,000 
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double tax = 0;

		System.out.print("Married or Single (M or S): ");
		String status = input.next();
		System.out.println("Enter your income: ");
		double income = input.nextDouble();
		input.close();

		if (status.toLowerCase().equals("s")) {
			if (income <= 8000)
				tax = income * 0.10;
			else if (income <= 32000)
				tax = (income * 0.15) + 800;
			else
				tax = (income * 0.25) + 4400;
		} else {
			if (income <= 16000)
				tax = income * 0.10;
			else if (income <= 64000)
				tax = (income * 0.15) + 1600;
			else
				tax = (income * 0.25) + 8800;
		}
		
		System.out.println("Your tax: " + tax);
		
	}

}