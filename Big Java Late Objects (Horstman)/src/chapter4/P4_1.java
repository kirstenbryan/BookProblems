package chapter4;
import java.util.Scanner;

/**
 * P4.1 - Write programs with loops that compute
 * 		a) The sum of all even numbers between 2 and 100 (inclusive).
 * 		b) The sum of all squares between 1 and 100 (inclusive).
 * 		c) All powers of 2 from 2^0 up to 2^20.
 * 		d) The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
 * 		e) The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
 * 
 * @author Bryan Kirsten
 *
 */
public class P4_1 {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		// Used in part D
		System.out.println("Please enter two values to be summed in part D: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("Please enter a value to sum all odd values in part E: ");
		String c = input.next();
		
		sumEvens();
		sumSquares();
		//allPowers();
		sumTwoInputs(a, b);
		sumOddDigits(c);
		
	}
	
	
	public static void sumEvens() {
		
		int sumEvens = 0;
				
		for (int i = 2; i <= 100; i += 2) {
			sumEvens += i;	
		}
		
		System.out.println("Sum of even numbers between 2 and 100 (inclusive): " + sumEvens);
		
	}
	
	public static void sumSquares() {
		
		int sumSquares = 0;
		
		for(int i = 1; i <= 100; i++) {
			sumSquares += Math.pow(2, i);
		}
		
		System.out.println("Sum of all squares between 1 and 100 (inclusive): " + sumSquares);
		
	}
	
	public static void allPowers() {
		
        int n = 1;

        for (int i = 0; i <= 20; i++) {
            System.out.printf("2^%d = %d/n", i, n);
            n = 2 * n;
        }
    }
	
	public static void sumTwoInputs(int a, int b) {
		
		int sumTwoInputs = 0;
				
		for (; a <= b; a += 1) {
			if(a % 2 == 1) sumTwoInputs += a;	
		}
		
		System.out.println("Sum of inputted a and b values (inclusive): " + sumTwoInputs);
		
	}
	
	public static void sumOddDigits(String c) {
		
		int sumOddDigits = 0;
				
		for (int i = 0; i < c.length(); i++) {
			String temp = c.substring(i, i + 1);
			int num = Integer.parseInt(temp);
			if(num % 2 == 1) sumOddDigits += num;
		}
		
		System.out.println("Sum of all odd digits for inputted value: " + sumOddDigits);
		
	}
	
}
