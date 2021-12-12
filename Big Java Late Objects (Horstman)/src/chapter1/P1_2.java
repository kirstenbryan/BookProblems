package chapter1;

/**
 * 
 * Write a program that prints the sum of the first ten positive integers, 1 + 2 + ... + 10
 * 
 * @author Bryan S. Kirsten
 *
 */

public class P1_2 {
	
	public static void main(String args[]) {
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) sum += i;
		
		System.out.println("The sum of the first ten positive numbers is: " + sum);
	
	}

}
