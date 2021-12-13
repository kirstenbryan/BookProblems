package chapter1;

/**
 * 
 * Write a program that prints the balance of an account after the first, second, and third year. The account has an initial
 * balance of $1,000 and earns 5 percent interest per year.
 * 
 * @author Bryan S. Kirsten
 *
 */

public class P1_4 {
	
	public static void main(String args[]) {
		
		double initialBalance = 1000.00;
		double interest = 0.05;
		
		double balanceYearOne = initialBalance + (initialBalance * interest);
		double balanceYearTwo = balanceYearOne + (balanceYearOne * interest);
		double balanceYearThree = balanceYearTwo + (balanceYearTwo * interest);
		
		System.out.println("Balance after year one: " + balanceYearOne);
		System.out.println("Balance after year two: " + balanceYearTwo);
		System.out.printf("Balance after year three: " + balanceYearThree);
		
	}

}
